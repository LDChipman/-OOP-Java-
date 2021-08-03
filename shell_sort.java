import java.util.Arrays;

public class shell_sort {
    
    public static void main(String[] args) {

        System.out.println("Shell Sort Demo:");
        int[] unsorted_array = {6, 2, 9, 4, 7, 3, 1, 5, 8, 0};
        System.out.println("Unsorted Array = " + Arrays.toString(unsorted_array));
        int[] sorted_array = sort(unsorted_array, 0);
        System.out.println("Sorted Array = " + Arrays.toString(sorted_array));
        
        
    }

    public static int[] sort(int[] array, int i){

        int gap = array.length / 2;
        return compare(gap, i, i+gap, array, i);

    }

    private static int[] compare(int gap, int first_num_index, int second_num_index, int[] array, int original_index){

        if (first_num_index < 0){

            return compare(gap, original_index+1, original_index+1+gap, array, original_index+1);

        } else if (second_num_index > array.length-1) {

            return compare(gap/2, 0, 0+gap/2, array, 0);

        }

        if (array[first_num_index] > array[second_num_index]) {
            
            array = swap(array, first_num_index, second_num_index);
            return compare(gap, first_num_index - gap, first_num_index, array, original_index);

        }
        
        if (gap == 0){
            return array;
        }

        if (second_num_index < array.length-1){
            return compare(gap, first_num_index+1, second_num_index+1, array, original_index+1);
        }

        return compare(gap/2, 0, 0+gap/2, array, 0);

    }

    private static int[] swap(int[] array, int first_num_index, int second_num_index){

        int temp = array[first_num_index];
        array[first_num_index] = array[second_num_index];
        array[second_num_index] = temp;
        return array;

    }

}
