public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        // Expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The difference is the missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // n = 6
        int n = 6;
        
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
