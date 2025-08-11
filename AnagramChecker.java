import java.util.*;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
    //method to check
    str1 = str1.replaceAll("\\s","").toLowerCase();
    str2 = str2.replaceAll("\\s","").toLowerCase();

    //check if length are different
    if(str1.length() != str2.length()) {
        return false;
    }
    //convert str to char arrays ans sort them
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    //compare sorted arrays
    return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        if(areAnagrams(str1, str2)) {
            System.out.println("The string is anagrams.");
        } else {
            System.out.println("The string is not anagrams");
        }
        sc.close();
    } 
}