public class shell_sort {

    //Sorts an array of ints using a shell sort algorithm
    public static int[] sort(int[] array){

        //sets the starting gap length and begins the program
        int gap = array.length / 2;
        return compare(gap, 0, 0+gap, array, 0);

    }

    //Compares two numbers and then returns an array with two numbers swapped putting the lower number at the first index
    private static int[] compare(int gap, int first_num_index, int second_num_index, int[] array, int original_index){

        //Checks if the gap has been reduced to 0 and if so returns the sorted array
        if (gap == 0){
            return array;
        }

        //Checks if the index is less than 0 and sets it to original index (needed to reset the index after swapping multiple numbers)
        if (first_num_index < 0){

            return compare(gap, original_index+1, original_index+1+gap, array, original_index+1);

        } 
        
        //Checks if the second numbers index is out of bounds (lets the program know to start over at a new gap)
        else if (second_num_index > array.length-1) {

            return compare(gap/2, 0, 0+gap/2, array, 0);

        }

        /* Checks if the number at the first index is greater than the one at the second index
           and if it is it swaps the numbers and checks if it needs to swap the number now at 
           the first index with the one gap length before it
        */
        if (array[first_num_index] > array[second_num_index]) {
            
            array = swap(array, first_num_index, second_num_index);
            return compare(gap, first_num_index - gap, first_num_index, array, original_index);

        }

        //Checks to make sure the second index isn't out of bounds and then runs another comparison at the next highest index
        if (second_num_index < array.length-1){
            return compare(gap, first_num_index+1, second_num_index+1, array, original_index+1);
        }

        //Compares the numbers again at the next gap starting at index 0 in the array
        return compare(gap/2, 0, 0+gap/2, array, 0);

    }

    //Swaps the numbers at 2 indeces and returns the new array
    private static int[] swap(int[] array, int first_num_index, int second_num_index){

        //Creates temporary storage for the int at the first index
        int temp = array[first_num_index];

        //Sets the int at the first index to the int at the second index
        array[first_num_index] = array[second_num_index];

        //Sets the int at the second index to the int at the first index by using the temporary storage of the int at the first index
        array[second_num_index] = temp;

        //Returns the array with the given numbers swapped
        return array;

    }

}
