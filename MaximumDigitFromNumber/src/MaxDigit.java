import javax.swing.*;

public class MaxDigit {

    public static void main(String[] args){
        int number = Integer.parseInt(JOptionPane.showInputDialog("your number is: "));
        int number1 = number;
        int maxDigit = 0;
        while(number1 > 0) {
            int digit = number1 % 10;
            if(digit > maxDigit){
                maxDigit = digit;
            }
            number1 = number1 / 10;
        }
        System.out.print("The max digit of number " + number + " is: " + maxDigit);
    }

}
