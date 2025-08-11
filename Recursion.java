public class Recursion {

    public static int factorial(int n) {
      if(n == 0) { // Base Case
        return 1;
      }
      return n * factorial (n - 1); // Recursive Case
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}