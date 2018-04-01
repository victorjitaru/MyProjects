import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DisplayThePlaces {
    public static void main(String[] args) throws IOException {
        Scanner diskScanner = new Scanner(new File("Places.txt"));
       /* File places = new File("Places.txt");
        System.out.println("Looking for " + places.getCanonicalPath());*/
        /*for(int i = 0; i <=3; i++){
            living(diskScanner);
        }*/

        while (diskScanner.hasNext()) {
            living(diskScanner);
        }

    }

    static void living(Scanner aScanner) {
        PlacesToLive aPlace = new PlacesToLive();

        aPlace.setAddress(aScanner.nextLine());
        aPlace.setNumBedrooms(aScanner.nextInt());
        aPlace.setArea(aScanner.nextDouble());
        aScanner.nextLine();
        System.out.printf("The property in %s has a surface of %.2f and %d bedrooms ", aPlace.getAddress(), aPlace.getArea(), aPlace.getNumBedrooms());
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input price for this property: ");
        double price = keyboard.nextDouble();
        System.out.println("The Price for this property is " + aPlace.costArea(price) + " per square meter and " + aPlace.costRoom(price) + " per bedroom");
    }
}
