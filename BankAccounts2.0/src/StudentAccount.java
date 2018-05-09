public class StudentAccount extends Account {

    private Double commission;
    private Double interest;

    public StudentAccount(String name, String iban, Double balance){
        super(name, iban, balance);
        commission = 1.0;
        interest = 1.5;
    }

    public void withdraw(Double amount) {
        this.setBalance(getBalance() - amount - (this.commission * amount/ 100));
    }

    public void deposit(Double amount) {
        this.setBalance(getBalance() + amount);
    }

    public void getLoan(Double amount){

        this.setBalance(getBalance() + amount);
        System.out.println("You will have to return " + amount + " + " + interest * amount / 100 + " interest");
    }

    @Override
    public String toString() {
        return super.toString() + "-student";
    }
}
