import java.util.Scanner;

public class ArrayStuff {
    public int[] readArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            System.out.print("Input element " + i + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public void displayArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}
