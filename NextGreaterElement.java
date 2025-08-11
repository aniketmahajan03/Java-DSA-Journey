import java.util.*;

public class NextGreaterElement {
    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>();

        //Traverse from ryt to lft
        for(int i=n-1; i>=0; i--) {
            //pop elements smaller than current
            while(!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            result[i] = s.isEmpty() ? -1 : s.peek();

            s.push(arr[i]);
        }
        return result;
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 2, 10, 8};
        int nge[] = findNextGreaterElements(arr);

        System.out.println("Next Greater Elements: "+ Arrays.toString(nge));
    }
}