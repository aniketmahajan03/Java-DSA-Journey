public class WordCounter {
    public static int countWords(String input) {
        if(input == null || input.trim().isEmpty()) {
            return 0;
        }

        //split by one or more spaces regex
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String args[]) {
        String input = "Hello Aniket! Welcome to Java programming." ;
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

    }
}