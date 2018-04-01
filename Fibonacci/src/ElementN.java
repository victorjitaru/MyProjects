import javax.swing.*;

public class ElementN {

    public static int fibonacci(int x){
        if (x == 0 || x == 1){
            return 1;
        }
        int elementFib = fibonacci(x-1) + fibonacci(x - 2);
        return elementFib;
    }

    public static void main(String[] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Input n: "));
        System.out.print(fibonacci(n));


    }

}
