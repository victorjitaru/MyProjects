import java.util.Arrays;
import java.util.Scanner;

public class Bank {

    private int addedAccounts = 0;
    private Account[] accountList = new Account[1];

    public void addAccount(Account account){
        if(addedAccounts >= accountList.length){
            accountList = Arrays.copyOf(accountList, accountList.length * 2);
            accountList[addedAccounts] = account;
            addedAccounts ++;
        } else {
            accountList[addedAccounts] = account;
            addedAccounts++;
        }
    }

    public void displayAccounts(){
        System.out.println("The bank has " + addedAccounts + " open accounts");
        for (int i = 0; i < accountList.length; i++){
            Account account = accountList[i];
            System.out.print(i+1 + ". ");
            System.out.println(account);
        }
    }

    public Account selectAccount(){
        Scanner scanner = new Scanner(System.in);
        displayAccounts();
        System.out.println("Input account ID:");
        int id = scanner.nextInt();
        Account searchedAccount = null;
        for(int i = 0; i < accountList.length; i++){
            if(id == i+1){
                searchedAccount = accountList[i];
            }
        }
        return searchedAccount;
    }

    public void sortAccounts(){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < accountList.length-1; i++){
                if(accountList[i].getBalance() > accountList[i+1].getBalance()){
                    swap(i);
                    isSorted = false;
                }
            }
        }
    }

    private void swap(int i){
        Account temp = accountList[i];
        accountList[i] = accountList[i+1];
        accountList[i+1] = temp;
    }
}
