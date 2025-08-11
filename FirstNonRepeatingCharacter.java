import java.util.*;
public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String str) {
        // Create a LinkedHashMap to maintain insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        //count the occurence of each character
        for(char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch,0)+1);
        }
        // find first character with count of 1.
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        // Return a special value if no non-repeating character is found
        return '\0'; //null character to indicate if not found
    }

    public static void main(String args[]) {
        String input = "hello";
        char result = findFirstNonRepeatingCharacter(input);
        
        if(result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
    
}

// LinkedHashMap is used in this solution because it preserves
 //the insertion order of elements, which is essential to efficiently
 // find the first non-repeating character in the string

//  2nd for loop explanation
//  This loop iterates through all key-value pairs in charCountMap 
//  and finds the first character with a count of 1. 
//  When found, it immediately returns that character.

// Example for a map {h=1, e=1, l=2, o=1}:
// Entry 1: Key = h, Value = 1
// Entry 2: Key = e, Value = 1
// Entry 3: Key = l, Value = 2
// Entry 4: Key = o, Value = 1
