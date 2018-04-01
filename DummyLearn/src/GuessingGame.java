import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer from 1 to 10: ");

        int inputNumber = sc.nextInt();
        int randomNumber = new Random().nextInt(10);

        if(inputNumber == randomNumber){
            System.out.println("************");
            System.out.println("*You win*");
            System.out.println("***********");
        } else{
            System.out.println("You lose");
            System.out.println("The number was " + randomNumber + ".");
        }

        System.out.println("Thanks for playing");
    }
}
