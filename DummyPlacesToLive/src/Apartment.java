public class Apartment extends PlacesToLive{
    private static double rent;

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }

    void costPerMonth(double cost){
        System.out.println("The price is " + ((cost + rent) / getNumBedrooms()) + " per bedroom.");
    }
}