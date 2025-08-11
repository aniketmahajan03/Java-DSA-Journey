public class firstpalindrome {


    public static String findFirstPalindrome(String str) {
        String[] words = str.split("\\s+");

        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "None";
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right++;
        }

        return true;
    }


    public class FirstPalindrome {
        public static void main(String[] args) {
            String input = "This is  level racecar test";
            String result = findFirstPalindrome(input);
            System.out.println("First Palindrome: " + result);
        }
    }
}