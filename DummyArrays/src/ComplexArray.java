import java.util.Scanner;


public class ComplexArray {
    public static void main(String[] args){
        int[][] matrix = new int[3][3];
        System.out.println("Input numbers: ");
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
