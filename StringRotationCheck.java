public class StringRotationCheck {

    public static boolean isRotation(String str1, String str2) {
        //check if lengths are different, return false early
        if(str1.length() != str2.length()) {
            return false;
        }

        //Concatenation(jodne). str with itselt
        String concatenated = str1 + str1;

        //Check if str2 is a substring of concatenated
        return concatenated.contains(str2);
    }

    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "cab";

        if(isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is NOT a rotation of " + str1);
        }
    }
}