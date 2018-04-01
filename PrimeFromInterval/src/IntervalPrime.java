import javax.swing.*;

public class IntervalPrime {

    public static boolean checkPrime(int checkedNumber) {
        int noDiv = 0;
        int divisor = 2;
        boolean prime = true;
        while (divisor <= (checkedNumber / 2) && (noDiv == 0)) {
            if (checkedNumber % divisor == 0) {
                noDiv++;
                prime = false;
            }
            divisor++;
        }
        return prime;
    }


    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("n1 = "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("n2 = "));


        int countPrimeInInterval = 0;
        int j = n1;
        while ((countPrimeInInterval == 0) && (j <= n2)) {
//            countPrimeInInterval = 0;
            if (checkPrime(j) == true) {
                countPrimeInInterval++;
                System.out.print("In the interval " + n1 + "-" + n2 + " there is at least 1 prime (" + j + ").");
            }
            j++;
        }

    }

}
