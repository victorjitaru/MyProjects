import java.util.Random;
import java.util.Scanner;

public class RepeatingGuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the guessing game!");

        int noGuesses = 0;
        int randomNumber = new Random().nextInt(10);

        System.out.print("Input an integer from 1 to 10: ");
        int inputNumber = sc.nextInt();
        noGuesses++;

        while(inputNumber != randomNumber){
            System.out.println("Try again!");
            System.out.print("Input another number: ");
            inputNumber = sc.nextInt();
            noGuesses++;
        }
        System.out.println("You won after " + noGuesses + " guesses!!!");
    }
}
