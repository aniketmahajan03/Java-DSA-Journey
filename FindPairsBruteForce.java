public class FindPairsBruteForce{

    public static void findPairs(int[] arr, int targetSum) {
        boolean found = false;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == targetSum) {
                    System.out.println("Pairs: (" + arr[i] + ","+arr[j] + ")");
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println("no pairs found" +  targetSum );
        }

    }
    public static void main(String args[]) {
        int arr[] = {1, 5, 7, -1, 5};
        int targetSum = 3;

        System.out.println("pairs with sum" + targetSum +":");
        findPairs(arr, targetSum);  
    }
}

//   Using HashMap<>();
// import java.util.*;

// public class FindPairsWithSum {

//     // Function to find pairs with the given sum
//     public static List<int[]> findPairs(int[] arr, int targetSum) {
//         List<int[]> pairs = new ArrayList<>();
//         Map<Integer, Boolean> seen = new HashMap<>();

//         for (int num : arr) {
//             int complement = targetSum - num;

//             if (seen.containsKey(complement)) {
//                 pairs.add(new int[]{complement, num});
//             }

//             seen.put(num, true);
//         }

//         return pairs;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 5, 7, -1, 5};
//         int targetSum = 6;

//         List<int[]> result = findPairs(arr, targetSum);
        
//         System.out.println("Pairs with sum " + targetSum + " :");
//         for (int[] pair : result) {
//             System.out.println(Arrays.toString(pair));
//         }
//     }
// }
