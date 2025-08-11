import java.util.*;
public class LIS {

    
    public static int lcs(int arr1[]) {
        // Hashset is used to add unique elements
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        int arr2[] = new int[set.size()]; // Sorted unique elements
        int i=0;
        for(int num : set) {
            arr2[i] = num;
            i++;
        }
        Arrays.sort(arr2);
        return lcs(arr1, arr2);
    }
    public static void main(String args[]) {
        int arr[] = {50,3,10,7,40,80};
    }
}