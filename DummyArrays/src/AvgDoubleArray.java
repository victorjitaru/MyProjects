import java.util.Scanner;

public class AvgDoubleArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double[] array1 = new Double[5];
        System.out.print("Input numbers of type double: ");
        double sum = 0;
        for(int i = 0; i < 5; i++){
            array1[i] = sc.nextDouble();
            sum += array1[i];
        }
        double avg = sum/array1.length;
        System.out.println("The average of your array is: " + avg);
    }
}
