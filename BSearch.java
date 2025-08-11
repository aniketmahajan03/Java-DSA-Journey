
import java.util.Arrays;

public class BSearch {
    public static int binarySearch(int numbers[], int key) {
        Arrays.sort(numbers); // if array is not sorted
        int start = 0, end = numbers.length-1;

         while( start <= end) {
            // (start + end) / 2
            int mid = start + (end - start) / 2; 

            //Compare
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid+1;
            } else 
               end = mid-1;

         }
         return -1;
    }
    public static void main(String args[]) {
        // int numbers[] = {2,3,5,7,9,12,14,23};
        int numbers[] = {5,2,8,1,9,4,8};
        // [1, 2, 4, 5, 8, 8, 9] array after sorting

        int key = 8;

        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }
}
