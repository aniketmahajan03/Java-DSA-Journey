import java.util.Arrays;

public class RemoveDuplicatesSorted {

   public static int removeDuplicates(int[] arr) {
    Arrays.sort(arr);

    if(arr.length == 0) {
        return 0;
    }
    
    int uniqueIndex = 0;

    for(int i = 1; i < arr.length; i++) {
        //keep unique element only
        if(arr[i] != arr[uniqueIndex]) {
            uniqueIndex++;
            arr[uniqueIndex] = arr[i];
        }
    }
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 1, 3, 2, 5, 3};
        int uniqueCount = removeDuplicates(arr);

        System.out.println("Arrays after removing duplicates:");
        for(int i=0; i<uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}