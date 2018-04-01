public class PlacesToLive {
    private String address;
    private static int numBedrooms;
    private static double area;

    public void setAddress(String address){
        if(!address.equals("")){
            this.address = address;
        }
    }
    public String getAddress(){
        return address;
    }

    public void setNumBedrooms(int numBedrooms){
        this.numBedrooms = numBedrooms;
    }
    public int getNumBedrooms(){
        return numBedrooms;
    }

    public void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return area;
    }

    public double costArea(double cost){
        return cost / area;
    }

    public double costRoom(double cost){
        return cost / (double)numBedrooms;
    }
}
