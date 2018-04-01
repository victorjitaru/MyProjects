import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double gpa;
    private double[] grades = new double[5];

    public void readStudent(Scanner diskScanner){
            name = diskScanner.nextLine();
            id = diskScanner.nextInt();
            for(int i = 0; i < 5; i++){
                grades[i] = diskScanner.nextDouble();
            }

    }

    public void writeStudent(){
        System.out.print(name + "\t" + id + "\t");
        for(int i = 0; i < 5; i++){
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }

}
