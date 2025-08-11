public class StringReversal {
    public static String reverseString(String input) {
        if(input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
    public static void main(String args[]) {
        String input = "Hello Aniket";
        System.out.println("Original: " + input);
        System.out.println("Reversed " + reverseString(input));
    }
}


