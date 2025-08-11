public class ReverseStr {
    public static void main(String args[]) {
        String str = "Interview";
        String rev = "";

        for(int i = str.length() -1; i>=0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("reversed: " + rev);
    }
}
