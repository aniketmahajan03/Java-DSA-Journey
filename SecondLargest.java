public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        if(arr.length < 2) {
            System.out.println("Arrays must contain at least two elements");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest found");
            return -1;
        }
        return secondLargest;
    }

    public static void main(String args[]) {
        int[] array = {12,2,34,10,35,1};
        int result = findSecondLargest(array);
        System.out.println("Second largest element is:" + result);
    }
}