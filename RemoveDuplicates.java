public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        if(arr.length == 0) return 0;

        int j = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }

    public static void main(String args[]) {
        int[] array = {2,4,5,5,6,7,7,8,1,9,9};
        int length = removeDuplicates(array);
        System.out.println("Arrays after removing duplicates: ");
        for(int i=0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}