public class ReplaceSubstring {

    public static String replaceSubstring(String original, String target, String replacement) {
        //use built in replace method
        return original.replace(target, replacement);
    }

    public static void main(String args[]) {
        String input = "Hello aniket! welcome to world of java";
        String target = "aniket";
        String replacement = "smarty";

        String result = replaceSubstring(input,target,replacement);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
}

// in-build function 
// return original.replace(target, replacement);
// original: The original string where replacements need to happen.
// replace(target, replacement): Replaces all occurrences of
//  the target substring with the replacement

// Important Notes:
// If the target substring is not found in the original,
//  the method simply returns the original string unchanged.
// Strings in Java are immutable, so the original string
//  is not modified; instead, a new string is created and
//   returned.