import javax.swing.*;

public class SumOfNTermsInFibonacci {

    public static int fibonacci(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        return fibonacci(x- 1) + fibonacci(x -2);
    }

    public static void main(String[] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Input number:"));
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += fibonacci(i);
        }

        System.out.print("The sum of the first " + n + " elements in Fibonacci is: " + sum);

    }

}
