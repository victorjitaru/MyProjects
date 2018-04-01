import java.util.Scanner;

public class InputPositiveThenMaxWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your number: ");
        int inputNumber = sc.nextInt();
        int max = inputNumber;

        while(inputNumber > 0){
            System.out.print("Next: ");
            inputNumber = sc.nextInt();
            if(inputNumber > max){
                max = inputNumber;
            }
        }
        System.out.println("You entered 0 or negative!");
        System.out.println("The maximum number is: " + max);
    }
}
