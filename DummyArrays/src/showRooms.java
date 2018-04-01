import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class showRooms {
    public static void main(String[] args) throws IOException {
        Room rooms[] = new Room[10];

        Scanner diskScanner = new Scanner(new File("RoomList.txt"));
        for (int i = 0; i < 10; i++) {
            rooms[i] = new Room();
            rooms[i].readRoom(diskScanner);
        }

        System.out.println("Room\tGuests\tRate\tSmoking");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t\t");
            rooms[i].writeRoom();
        }
    }
}
