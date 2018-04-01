import javax.swing.*;

public class MaxNumbers {

    public static int maxim(int x, int y) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

    public static int maxim(int x, int y, int z){
        int max;
        if(x > y){
            if(x > z){
                max = x;
            } else{
                max = z;
            }
        }else if(y > z){
            max = y;
        } else{
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("First Number: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Second number: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Third number: "));

    System.out.println("Max of " + n1 + " and " + n2 + " is " + maxim(n1, n2));
    System.out.println("Max value among " + n1 + ", " + n2 + " and " + n3 + " is: " + maxim(n1, n2, n3));
    }

}
