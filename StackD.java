import java.util.*;

public class StackD {
    public static void main(String args[]) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) { // Start from the last element and go up to index 0
            // 1. while loop to maintain decreasing elements in stack
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            // 2. if-else to set the next greater element
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = s.peek();
            }

            // 3. push current element in stack
            s.push(arr[i]);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
