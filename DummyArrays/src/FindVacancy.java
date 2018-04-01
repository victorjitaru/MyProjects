import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FindVacancy {

    public static void main(String[] args) throws IOException {
        int[] guests = new int[10];

        Scanner diskScanner = new Scanner(new File("GuestList.txt"));
        for (int i = 0; i < 10; i++) {
            guests[i] = diskScanner.nextInt();
        }

        System.out.println("Your room config is: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + guests[i]);
        }

        int roomNum = 0;
        while (roomNum < 10 && guests[roomNum] != 0) {
            roomNum++;
        }
        if (roomNum == 10) {
            System.out.println("Sorry, no vacancy!");
        } else {
            System.out.print("How many people for room " + roomNum + " ?");
            Scanner sc = new Scanner(System.in);
            guests[roomNum] = sc.nextInt();

            PrintStream listOut = new PrintStream("GuestList.txt");
            for (int i = 0; i < 10; i++) {
                listOut.print(guests[i]);
                listOut.print(" ");
            }
            System.out.println("Your new room config is: ");
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "\t" + guests[i]);

            }
        }
    }
}
