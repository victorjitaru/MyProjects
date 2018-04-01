public class House extends PlacesToLive{
    private static double mortCost;
    private static double propTax;

    public void setMortCost(double mortCost){
        this.mortCost = mortCost;
    }
    public double getMortCost(){
        return mortCost;
    }

    public void setPropTax(double propTax){
        this.propTax = propTax;
    }
    public double getPropTax(){
        return propTax;
    }

    void costPerMonth(double cost){
        System.out.println("The price is " + (cost + mortCost + (propTax / 12) / getArea()) + " per square meter.");
    }
}
