
import java.util.Arrays;

public class removedup {
    
    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0) return 0; //base con. if array is empty

        //sort condition
        Arrays.sort(arr);

        int i = 0;
        for(int j = 1; j<arr.length; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 2, 2, 8, 4, 6, 1, 8, 3};

        int uniqueCount = removeDuplicate(arr);

        System.out.println("array after removing duplicates: " + removeDuplicate(arr));
        for(int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
