
import java.util.*;

public class mergesort {
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n = array1.length;
        int m = array2.length;
        int[] mergedArray = new int[n + m];

        int i = 0, j = 0, k = 0;

        while(i < n && j < m) {
            if(array1[i] <= array2[j]) {
                mergedArray[k++] =array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }
            
        while(i < n) {
            mergedArray[k++] = array1[i++];
        }

        while(j < m) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }

    public static void main(String args[]) {
        int[] array1 = {1,3,5,7};
        int[] array2 = {2,4,6,8};

        int[] result = mergeSortedArrays(array1, array2);
        System.out.println("Merged array :" + Arrays.toString(result));
    }
}