public class Main {
    
    public static boolean ispalindrome(String str) {
        // Handle null or empty string cases
        if (str == null || str.isEmpty()) {
            return false; // Or true if you consider empty strings as palindromes
        }

        // Loop through half of the string length
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            // Compare characters from the beginning and end
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false; // If any characters don't match, it's not a palindrome
            }
        }
        
        return true; // If all characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        String str = "aniket";
        System.out.println(ispalindrome(str)); // Output: true

        // Uncomment the following lines if needed
        // String firstname = "Aniket";
        // String lastname = "Mahajan";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname.charAt(8)); // Output: 'M'
    }

    // Uncomment if you're using a testing framework
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
}
