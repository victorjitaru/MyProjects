public class SavingsAccount extends Account {

    private Double interest;

    public SavingsAccount(String name, String iban){
        super(name, iban, 0.0);
        interest = 25.00;
    }

    @Override
    public void deposit(Double amount) {
        this.setBalance(this.getBalance() + amount + (amount * interest / 100));
    }

    @Override
    public void withdraw(Double amount) {
        System.out.println("Withdraw unavailable in savings account! Please transfer founds to regular account");
    }

    @Override
    public String toString() {
        return super.toString() + "-savings";
    }
}
