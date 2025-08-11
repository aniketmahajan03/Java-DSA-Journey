public class SecondLargestElement {
    //fun to find 2nd largest
    public static int findSecondLargest(int[] nums) {
        if(nums == null || nums.length < 2) {
            throw new IllegalArgumentException("arrays must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : nums) {
            if(num > largest) {
                secondLargest = largest; // update 2nd largest
                largest = num; // update largest
            } else if(num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("no valid 2nd largest element found");
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] nums = {12};
        try {
            int result = findSecondLargest(nums);
            System.out.println("The second largest element is: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// if (nums == null || nums.length < 2) {
//     throw new IllegalArgumentException("Array must have at least two elements.");
// }
// why we are not using System.out.print 

// System.out.print() merely displays a message to the console but does 
// not stop the program's execution. The program would continue running, possibly
//  leading to incorrect behavior or additional errors.
// // Throwing an exception (throw new IllegalArgumentException) immediately halts the execution 
// and signals to the caller that something went wrong (in this case, an invalid input).

// Aspect	System.out.print()	|  throw new IllegalArgumentException()
// Stops execution	❌ No	                    ✅ Yes
// Error notification	❌ Informal message	    ✅ Formal exception
// Appropriate for logic errors	❌ No	        ✅ Yes
// Usage in production-quality code	❌ Not ideal	✅ Recommended