public class RegularAccount extends Account {

    private Double commission;

    public RegularAccount(String name, String iban, Double balance) {
        super(name, iban, balance);
        commission = 5.0;
    }

    public Double getCommission() {
        return commission;
    }

    public void deposit(Double amount) {
        this.setBalance(getBalance() + amount);
    }


    public void withdraw(Double amount) {
        this.setBalance(getBalance() - amount - (getCommission() * amount / 100));
    }

    @Override
    public String toString() {
        return super.toString() + "-regular";
    }
}
