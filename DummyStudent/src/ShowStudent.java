import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowStudent {

    public static void main(String[] args) throws FileNotFoundException {
        Student students[] = new Student[5];

        Scanner diskScanner = new Scanner(new File("StudentList.txt"));
        int i = 0;
        while(diskScanner.hasNext()){
            students[i] = new Student();
            students[i].readStudent(diskScanner);
            i++;
        }

        System.out.println("Name\tID\tGrades");
        for(int j = 0; j < 5; j++){
            students[j].writeStudent();
        }
    }
}
