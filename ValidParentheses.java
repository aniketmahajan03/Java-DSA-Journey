import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
    Stack<Character> st = new Stack<>();

    for(char ch : s.toCharArray()) {
        if(ch == '(' || ch == '{' || ch == '[') {
            st.push(ch); //push opening brackets
        } else {
            if(s.isEmpty())  return false;
          

        char top = st.pop();
        if((ch == ')' && top != '(') ||
          (ch == '}' && top != '{') ||
          (ch == ']' && top != '[')) {
            return  false; // Mismatch
        }
    }
}
        return st.isEmpty();
    }

    public static void main(String args[]) {
        String str1 = "()[]{}";
        String str2 = "(}";

        System.out.println("Is " + str1 + "valid? " + isValid(str1));
        System.out.println("Is " + str2 + "valid? " + isValid(str2));
    }
    
}