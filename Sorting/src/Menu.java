import java.util.Scanner;

public class Menu {
    private final static int EXIT_OPTION = 0;

    public void displayMenu(){
        displayMenu(new int[0]);
    }

    private void displayMenu(int[] array) {
        displayOptions();
        int option = readOption();
        if (option != EXIT_OPTION) {
            int[] newArray = processOption(option, array);
            displayMenu(newArray);
        }
    }

    private void displayOptions() {
        System.out.println();
        System.out.println("1.Read array");
        System.out.println("2.Display array");
        System.out.println("3.BubbleSort array");
        System.out.println("4.MergeSort array");
        System.out.println("5.QuickSort array");
        System.out.println("0.Exit");
        System.out.println();
    }

    private int readOption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input option: ");
        int option = sc.nextInt();
        return option;
    }
//de ce atunci cand introduc o optiune care este OutOfBounds(mai mica decat 0 sau mai mare ca 4), la urmatoarea incercare cu 0 nu opreste rularea (mai trebuie dat inca un 0)
    private int[] processOption(int option, int[] array) {
        ArrayStuff arrays = new ArrayStuff();
        BubbleSorting bs = new BubbleSorting();
        MergeSorting ms = new MergeSorting();
        QuickSorting qs = new QuickSorting();
        if (option <= 5 && option >= 0) {
            switch (option) {
                case 1:
                    return arrays.readArray();
                case 2:
                    arrays.displayArray(array);
                    break;
                case 3:
                    bs.sort(array);
                    break;
                case 4:
                    ms.sort(array);
                    break;
                case 5:
                    qs.sort(array);
                    break;
                case 0:
                default:
            }
        } else {
            System.out.println();
            System.out.println("Choose another option");
            displayMenu();
        }
        return array;
    }
}
