import java.util.Arrays;

public class selection_sort {

    public static void main(String[] args) {

        //Prints the Name of the sort, an unsorted array of integers and the sorted list
        System.out.println("Selection Sort Demo:");
        int[] unsorted_array = {6, 2, 9, 4, 7, 3, 1, 5, 8, 0};
        System.out.println("Unsorted Array = " + Arrays.toString(unsorted_array));
        int[] sorted_array = sort(unsorted_array, 0);
        System.out.println("Sorted Array = " + Arrays.toString(sorted_array));
        
    }


    //Sorts an array of integers in ascending order using a selection sort algorithm
    public static int[] sort(int[] array, int i){

        //Checks if the entire array has been sorted and if it has ends the method
        if (i == array.length) {
            return array;
        }

        //Sets the int at the first unsorted index in the array to a variable min and saves its index for later
        int min = array[i];
        int min_index = i;
        
        /* Checks if the next int in the array is lower or equal to the current minimum and
           if it is then it sets min to that number and saves that ints index
        */
        for (int n = i; n < array.length; n++) {
            if (array[n] <= min) {
                min = array[n];
                min_index = n;
            }
        }

        //Swaps the number at the first unsorted index and the number in min
        int unsorted_int = array[i];
        array[i] = min;
        array[min_index] = unsorted_int;
        
        //Runs the method starting at the new next unsorted index
        return sort(array, i+1);
    }
}