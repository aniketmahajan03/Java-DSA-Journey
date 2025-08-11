import java.util.*;

public class Hashing2 {
    public static void main(String args[]) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("union = "+ set.size());
        System.out.println("Union elements = " + set);

        //intersection
        set.clear();
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        HashSet<Integer> intersectionSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                intersectionSet.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection size = " + intersectionSet.size());
        System.out.println("Intersection elements = " + intersectionSet);
    }
}