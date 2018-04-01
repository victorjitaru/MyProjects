import java.util.Random;
import java.util.Scanner;

public class GuessingGameUpTo100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int noGues = 0;
        int randomNumber = new Random().nextInt(100);
        System.out.print("Input your number: ");
        int inputNumber = sc.nextInt();
        noGues ++;

        while(inputNumber != randomNumber){
            if(inputNumber > randomNumber){
                System.out.println("Lower!");
            }
            if(inputNumber < randomNumber){
                System.out.println("Higher!");
            }
            System.out.print("Input another number: ");
            inputNumber = sc.nextInt();
            noGues++;
        }
        System.out.println("You got it after " + noGues + " guesses!");


    }
}
