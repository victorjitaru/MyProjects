import java.io.File;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args){
        File evidence = new File("cookedBooks.txt");
        if(evidence.exists()){
            Scanner sc = new Scanner(System.in);
            char reply;
            do {
                System.out.print("Delete evidence?(y/n): ");
                reply = sc.findWithinHorizon(".", 0).charAt(0);
            } while(reply != 'y' && reply != 'Y' && reply != 'n' && reply != 'N');

            if(reply == 'y' || reply == 'Y'){
                System.out.println("here it goes!");
                evidence.delete();
                System.out.println("Evidence deleted");
            }
            else{
                System.out.print("You changer your mind, did you?");
            }
        }
    }
}
