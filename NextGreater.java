import java.util.Stack;

public class NextGreater {
    public static void findNextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            int nextGreater = stack.isEmpty() ? -1 : stack.peek();
            System.out.println(arr[i] + " --> " + nextGreater);
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        findNextGreater(arr);
    }
}
