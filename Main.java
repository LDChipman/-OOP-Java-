import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    
        //Selection sort test
        System.out.println("Selection Sort Demo:");
        int[] unsorted_array = {6, 2, 9, 4, 7, 3, 1, 5, 8, 0};
        System.out.println("Unsorted Array = " + Arrays.toString(unsorted_array));
        int[] sorted_array = selection_sort.sort(unsorted_array, 0);
        System.out.println("Sorted Array = " + Arrays.toString(sorted_array));

        //Puts a line in the console
        System.out.println();

        //Shell sort test
        System.out.println("Shell Sort Demo:");
        int[] unsorted_array2 = {6, 2, 9, 4, 7, 3, 1, 5, 8, 0};
        System.out.println("Unsorted Array = " + Arrays.toString(unsorted_array2));
        int[] sorted_array2 = shell_sort.sort(unsorted_array2, 0);
        System.out.println("Sorted Array = " + Arrays.toString(sorted_array2));
    }
}
