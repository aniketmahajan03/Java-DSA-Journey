import java.util.*;

public class Arrayspr {
    
    public static int removeDuplicates(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);

        int uniqueIndex = 0;

        //traverse the array
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }
    public static void main(String args[]) {
        int arr[] = {4,2,7,2,4,8,8,10};

        int length = removeDuplicates(arr);

        System.out.print("arrays withoiut duplicates:");
        for (int i=0; i<length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}