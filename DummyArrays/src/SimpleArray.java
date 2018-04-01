import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) throws IOException {
        int[] guests = new int[10];
        Scanner diskScanner = new Scanner(new File("GuestList.txt"));

        for (int i = 0; i < guests.length - 1; i++) {
            guests[i] = diskScanner.nextInt();
        }
        System.out.println("Room\t Guests");
        for (int i = 0; i < guests.length - 1; i++) {
            System.out.println(i + "\t\t\t" + guests[i]);
        }
    }
}
