public class Organization {
    String name;
    double revenue;
    boolean profit;

    public void display(){
        System.out.printf("%s is a company with a revenue of %10.2f", name, revenue);
    }

    public double taxAmmount(double taxPercent){
        return revenue * taxPercent / 100;
    }
}
