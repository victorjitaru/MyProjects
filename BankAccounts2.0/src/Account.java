public abstract class Account {

    private String name;
    private String iban;
    private Double balance;

    public Account(String name, String iban, Double balance){
        this.name = name;
        this.iban = iban;
        this.balance = balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance(){
        return balance;
    }

    public abstract void deposit(Double amount);

    public abstract void withdraw(Double amount);

    @Override
    public String toString() {
        return name + "(" + iban + "): $" + getBalance();
    }
}
