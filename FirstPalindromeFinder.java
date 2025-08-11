public class FirstPalindromeFinder {

    //method to check palindrome
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length()-1;
        while(left < right) {
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    // method to find 1st palindrome
    public static String findFirstPalindrome(String input) {
        if(input == null || input.isEmpty()) {
            return "None";
        }
        String[] words = input.split("\\s+");
        for(String word : words) {
            if(isPalindrome(word)) {
                return word;
            }
        }
        return "None";
    }

    public static void main(String args[]) {
        String input = "hello racecar world level madem";
        String result = findFirstPalindrome(input);
        System.out.println("First palindrime: "+ result);
    }
}