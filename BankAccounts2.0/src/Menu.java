import java.util.Scanner;

public class Menu {
    private final int EXIT_OPTION = 0;
    private Scanner scanner = new Scanner(System.in);
    private Bank bank = new Bank();


    public void displayMenu() {
        int option = -1;
        displayOptions();
        option = readOption();
        processOption(option);
        if (option != EXIT_OPTION) {
            displayMenu();
        }
    }

    private void displayOptions() {
        System.out.println("1. Add account");
        System.out.println("2. Display accounts");
        System.out.println("3. Account operations");
        System.out.println("4. Sort accounts");
        System.out.println("0. Exit");
    }

    private int readOption() {
        System.out.print("Option: ");
        return new Scanner(System.in).nextInt();
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                displayMenuForAddAccount();
                break;
            case 2:
                bank.displayAccounts();
                break;
            case 3:
                displayAccountOperationsMenu();
                break;
            case 4:
                bank.sortAccounts();
                break;
            case 0:
            default:
        }
    }

    //Add account
    private void displayMenuForAddAccount() {
        int option = -1;
        displayOptionsForAddAccount();
        option = readOption();
        processOptionForAddAccount(option);
        if (option != EXIT_OPTION) {
            displayMenuForAddAccount();
        } else {
            displayMenu();
        }
    }

    private void displayOptionsForAddAccount() {
        System.out.println("1. Add regular account");
        System.out.println("2. Add student account");
        System.out.println("3. Add business account");
        System.out.println("4. Add savings account");
        System.out.println("0. Exit");
    }

    private void processOptionForAddAccount(int option) {
        switch (option) {
            case 1:
                bank.addAccount(createRegularAccount());
                break;
            case 2:
                bank.addAccount(createStudentAccount());
                break;
            case 3:
                bank.addAccount(createBusinessAccount());
                break;
            case 4:
                bank.addAccount(createSavingsAccount());
                break;
            case 0:
            default:
        }
    }

    //Create accounts
    private Account createRegularAccount() {
        System.out.print("Input name: ");
        String accountName = scanner.next();
        System.out.print("Input IBAN: ");
        String accountIban = scanner.next();
        System.out.print("Input initial balance: ");
        Double accountBalance = scanner.nextDouble();
        return new RegularAccount(accountName, accountIban, accountBalance);
    }

    private Account createStudentAccount() {
        System.out.print("Input name: ");
        String accountName = scanner.next();
        System.out.print("Input IBAN: ");
        String accountIban = scanner.next();
        System.out.print("Input initial balance: ");
        Double accountBalance = scanner.nextDouble();
        return new StudentAccount(accountName, accountIban, accountBalance);
    }

    private Account createBusinessAccount() {
        System.out.print("Input name: ");
        String accountName = scanner.next();
        System.out.print("Input IBAN: ");
        String accountIban = scanner.next();
        System.out.print("Input initial balance: ");
        Double accountBalance = scanner.nextDouble();
        return new BusinessAccount(accountName, accountIban, accountBalance);
    }

    private Account createSavingsAccount() {
        System.out.print("Input name: ");
        String accountName = scanner.next();
        System.out.print("Input IBAN: ");
        String accountIban = scanner.next();
        return new SavingsAccount(accountName, accountIban);
    }

//Account operations

    private void displayAccountOperationsMenu() {
        int option = -1;
        Account account = bank.selectAccount();
        displayAccountOperations(account);
        option = readOption();
        processAccountOperationOption(option, account);
        if (option != EXIT_OPTION) {
            displayAccountOperationsMenu();
        } else {
            displayMenu();
        }
    }

    private boolean isRegularAccount(Account account) {
        if (account.getClass() == RegularAccount.class) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isStudentAccount(Account account) {
        if (account.getClass() == StudentAccount.class) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isBusinessAccount(Account account) {
        if (account.getClass() == BusinessAccount.class) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isSavingsAccount(Account account) {
        if (account.getClass() == SavingsAccount.class) {
            return true;
        } else {
            return false;
        }
    }

    private void displayBasicOperations() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
    }

    private void displayAccountOperations(Account account) {
        if (isRegularAccount(account)) {
            displayBasicOperations();
            System.out.println("0. Return to main menu");
        } else if (isStudentAccount(account)) {
            displayBasicOperations();
            System.out.println("3. Get loan");
            System.out.println("0. Return to main menu");
        } else if (isBusinessAccount(account)) {
            displayBasicOperations();
            System.out.println("3. Get extra credit");
            System.out.println("0. Return to main menu");
        } else if (isSavingsAccount(account)) {
            displayBasicOperations();
            System.out.println("3. Transfer founds");
        }
    }

    private void processAccountOperationOption(int option, Account account) {
        if (isRegularAccount(account)) {
            switch (option) {
                case 1:
                    depositAmount(account);
                    break;
                case 2:
                    withdrawAmount(account);
                    break;
                case 0:
                default:
            }
        } else if (isStudentAccount(account)) {
            switch (option) {
                case 1:
                    depositAmount(account);
                    break;
                case 2:
                    withdrawAmount(account);
                    break;
                case 3:
                    getLoanAmount((StudentAccount) account);
                    break;
                case 0:
                default:
            }
        } else if (isBusinessAccount(account)) {
            switch (option) {
                case 1:
                    depositAmount(account);
                    break;
                case 2:
                    withdrawAmount(account);
                    break;
                case 3:
                    getLoanAmount((BusinessAccount) account);
                    break;
                case 4:
                    payTax((BusinessAccount) account);
                    break;
                case 0:
                default:
            }
        } else if (isSavingsAccount(account)) {
            switch (option) {
                case 1:
                    depositAmount(account);
                    break;
                case 2:
                    withdrawAmount(account);
                    break;
                case 3:
                    transferAmount((SavingsAccount) account);
                    break;
                case 0:
                default:
            }
        }
    }

    private Double readAmount() {
        System.out.println("Input amount: ");
        return scanner.nextDouble();
    }

    private void depositAmount(Account account) {
        Double amount = readAmount();
        account.deposit(amount);
    }

    private void withdrawAmount(Account account) {
        Double amount = readAmount();
        account.withdraw(amount);
    }

    private void getLoanAmount(StudentAccount account) {
        Double amount = readAmount();
        account.getLoan(amount);
    }

    private void getLoanAmount(BusinessAccount account) {
        Double amount = readAmount();
        account.getLoan(amount);
    }

    private void transferAmount(SavingsAccount savingsAccount) {
        Double amount = readAmount();
        if (savingsAccount.getBalance() >= amount) {
            savingsAccount.setBalance(savingsAccount.getBalance() - amount);
            Account targetAccount = bank.selectAccount();
            targetAccount.setBalance(targetAccount.getBalance() + amount);
        } else {
            System.out.println("Insufficient founds");
            displayMenu();
        }
    }

    private void payTax(BusinessAccount account) {
        int option = -1;
        displayTaxMenu();
        option = readOption();
        processTaxOption(option, account);
        displayMenu();
    }

    private void processTaxOption(int option, BusinessAccount account) {
        switch (option) {
            case 1:
                account.calculateMonthlyTax();
                break;
            case 2:
                account.calculateYearlyTax();
                break;
            case 0:
            default:
        }
    }

    private void displayTaxMenu() {
        System.out.println("1. Tax for 1 month");
        System.out.println("2. Tax for 1 year");
        System.out.println("0. Cancel");
    }
}
