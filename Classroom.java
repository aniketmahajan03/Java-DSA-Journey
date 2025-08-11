import java.util.*;

public class Classroom {

    public static int lcs(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];

        // Bottom-up DP approach
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

    public static int lis(int arr1[]) {
        // Use TreeSet to store unique elements in sorted order
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        // Convert TreeSet to sorted array
        int[] arr2 = set.stream().mapToInt(Integer::intValue).toArray();

        return lcs(arr1, arr2);
    }

    public static void main(String args[]) {
        int arr[] = {50, 3, 10, 7, 40, 80};
        System.out.println("Length of LIS: " + lis(arr)); // Expected output: 4
    }
}
