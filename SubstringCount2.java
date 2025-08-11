public class SubstringCount2 {
    public static int countSubstringOccurences(String text, String substring) {
        if(substring.isEmpty()) {
            return 0; // Avoid infinite loop for empty substring
        }
        int count = 0;
        int index = 0;

         // Loop to find all occurrences of the substring
         while((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move index past the current match

         }
         return count;
    }

    public static void main(String args[]) {
        String text = "abcabcabc";
        String substring = "abc";

        int occurrences = countSubstringOccurences(text,substring);
        System.out.println("The substring \"" + substring + "\" appears " + occurrences + " times.");
    }
}

// while loop explanation -

// Example Walkthrough
// For text = "abcabcabc" and substring = "abc":

// First iteration:

// indexOf("abc", 0) returns 0.
// count++ makes count = 1.
// index += 3 moves the index to 3.
// Second iteration:

// indexOf("abc", 3) returns 3.
// count++ makes count = 2.
// index += 3 moves the index to 6.
// Third iteration:

// indexOf("abc", 6) returns 6.
// count++ makes count = 3.
// index += 3 moves the index to 9.
// Exit:

// indexOf("abc", 9) returns -1.
// Loop exits, returning 3.