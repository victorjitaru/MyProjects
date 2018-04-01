import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StoreInFile {
    public static void main(String[] args)throws IOException {
        Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));

        diskScanner.nextInt();
        diskScanner.nextDouble();
        diskScanner.next();
        diskScanner.nextLine();

        diskScanner.close();

        File employeeInfo = new File("EmployeeInfo.txt");
        System.out.println("Looking for " + employeeInfo.getCanonicalPath());
    }
}
