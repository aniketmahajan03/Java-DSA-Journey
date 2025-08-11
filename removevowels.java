public class removevowels {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = removeVowels(input);
        System.out.println("String without vowels: " + result);
    }

    public static String removeVowels(String str) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is not a vowel
            if (!isVowel(ch)) {
                result.append(ch); // Add non-vowel characters to result
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char ch) {
        // Check for vowels (both uppercase and lowercase)
        ch = Character.toLowerCase(ch);
        return ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
