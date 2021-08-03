public class merge_sort {

    public static int[] sort(int[] array){

        if (array.length == 1) {

            return array;
            
        }

        int array_mid = array.length/2;

        int[] array1 = new int[array_mid];
        int[] array2 = new int[(array.length)-array_mid];

        int index = 0;

        for (int n : array) {

            if (index < array.length/2){
                array1[index] = n;
            } else {
                array2[index-(array.length/2)] = n;
            }

            index++;
            
        }

        array1 = sort(array1);
        array2 = sort(array2);

        return mergeSort(array1, array2, array.length);
    }

    private static int[] mergeSort(int[] array1, int[] array2, int length){

        //Creates the array we will return after merging array1 and array2
        int[] array3 = new int[length];

        //Sets the index we are currently working on to 0
        int array1_current_index = 0;
        int array2_current_index = 0;

        /* While array1 and array2 both still have atleast 1 element we haven't sorted into array 3
           take the lowest number we haven't yet put into array3 and put it as the latest unsorted element of array3
        */
        while (array1_current_index <= array1.length-1 && array2_current_index <= array2.length-1){

            //Checks if array1's number is lower and if so sets it as the latest element in array3 otherwise sets array2's digit to it
            if (array1[array1_current_index] < array2[array2_current_index]) {
                
                array3[array1_current_index+array2_current_index] = array1[array1_current_index];
                array1_current_index++;

            } else {

                array3[array1_current_index+array2_current_index] = array2[array2_current_index];
                array2_current_index++;

            }

        }

        //Takes the elements of array1 and puts them into the latest elements of array 3
        while (array1_current_index <= array1.length-1) {

            array3[array1_current_index + array2_current_index] = array1[array1_current_index];
            array1_current_index++;

        }

        //Takes the elements of array2 and puts them into the latest elements of array 3
        while (array2_current_index <= array2.length-1) {

            array3[array1_current_index + array2_current_index] = array2[array2_current_index];
            array2_current_index++;

        }
        
        return array3;
    }
    
}
