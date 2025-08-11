public class SubstringCount {
    public static void main(String[] args) {
        String input = "abababab";
        String substring = "ab";
        int count = countSubstringOccurrences(input, substring);
        System.out.println("The substring appears " + count + " times.");
    }

    public static int countSubstringOccurrences(String str, String sub) {
        if (sub.isEmpty() || str.isEmpty() || sub.length() > str.length()) {
            return 0; // Handle edge cases
        }

        int count = 0;
        int index = 0;

        // Search for the substring in the string
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move index forward by the length of the substring
        }

        return count;
    }
}
