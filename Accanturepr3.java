public class Accanturepr3 {
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");

        return str.isEmpty() ? 0 : words.length;
    }



public static void main(String args[]) {
    String input = "this example of string";
    int wordCount = countWords(input);
    System.out.println("numbers of words:" + wordCount);
    }
}