import javax.swing.*;

public class CheckNInFibonacci {

    public static int fibonacci(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static void main(String[] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Input number: "));

        int i = 0;
        boolean found = false;
        while(i <= n && found == false){
            if (n == fibonacci(i)){
                found = true;
                System.out.println("Number " + n + " is part of Fibonacci");
            }
            i++;
        }
        if(found == false){
            System.out.println("Number " + n + " isn't part of Fibonacci");
        }

    }

}
