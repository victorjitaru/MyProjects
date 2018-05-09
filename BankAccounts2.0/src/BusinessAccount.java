public class BusinessAccount extends Account {

    private Double depositCommission;
    private Double withdrawCommission;
    private Double taxValue;
    private Double interest;

    public BusinessAccount(String name, String iban, Double balance) {
        super(name, iban, balance);
        depositCommission = 2.0;
        withdrawCommission = 0.0;
        taxValue = 19.00;
        interest = 15.00;
    }

    public Double getDepositCommission() {
        return depositCommission;
    }

    public Double getWithdrawCommission() {
        return withdrawCommission;
    }

    @Override
    public void deposit(Double amount) {
        this.setBalance(getBalance() + amount - (amount * getDepositCommission()));
    }

    @Override
    public void withdraw(Double amount) {
        this.setBalance(getBalance() - amount - (getWithdrawCommission() * amount / 100));
    }

    public void getLoan(Double amount){
        this.setBalance(getBalance() + amount);
        System.out.println("You will have to return " + amount + " (+ " + interest * amount / 100 + " interest)");
    }

    public Double calculateMonthlyTax(){
        return this.getBalance() * taxValue / 100;
    }

    public Double calculateYearlyTax(){
        return calculateMonthlyTax() * 12;
    }

    @Override
    public String toString() {
        return super.toString() + "-business";
    }
}
