public class SumOfDigits {

    public static int sumOfDigits(int n) {
       if(n == 0) { // Base Case
        return 1;
       }
       return (n % 10) + sumOfDigits(n / 10); //Recursive Case
    }

    public static void main(String args[]) {
        int n = 1234;
        System.out.println("Sum of " + sumOfDigits(n));
    }
}