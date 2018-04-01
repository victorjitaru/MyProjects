import java.util.Scanner;

public class DisplayThePlaces2_0 {
    public static void main(String[] args){
        House h1 = new House();
        h1.setAddress("10 No1 Street");
        h1.setArea(150.00);
        h1.setMortCost(25.00);
        h1.setPropTax(12);
        System.out.printf("The property in %s has a surface of %.2f square meters.", h1.getAddress(), h1.getArea());
        System.out.println();
        h1.costPerMonth(askPrice());

        House h2 = new House();
        h2.setAddress("20 No2 Street");
        h2.setArea(180.00);
        h2.setMortCost(28.50);
        h2.setPropTax(15.20);
        System.out.printf("The property in %s has a surface of %.2f square meters.", h2.getAddress(), h2.getArea());
        System.out.println();
        h2.costPerMonth(askPrice());

        Apartment a1 = new Apartment();
        a1.setAddress("30 No3 Street");
        a1.setArea(100.00);
        a1.setNumBedrooms(4);
        a1.setRent(100.00);
        a1.costPerMonth(200.50);

        Apartment a2 = new Apartment();
        a2.setAddress("55 No1 Street");
        a2.setArea(85.64);
        a2.setNumBedrooms(3);
        a2.setRent(90.00);
        a2.costPerMonth(180.53);
    }
    static double askPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input price for this property: ");
        double cost = sc.nextDouble();
        return cost;
    }

}
