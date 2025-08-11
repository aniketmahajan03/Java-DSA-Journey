import java.util.*;
public class BalancedParentheses {

    public static boolean isBalanced(String str) {
        Stack<Character> aniket = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                aniket.push(ch);
            } else if( ch == ')' && !aniket.isEmpty() && aniket.peek() == '(') {
                aniket.pop();
            } else if( ch == ']' && !aniket.isEmpty() && aniket.peek() == '[') {
                aniket.pop();
            } else if( ch == '}' && !aniket.isEmpty() && aniket.peek() == '{') {
                aniket.pop();
            } else {
                return false;
            }
        }
        return aniket.isEmpty();
    }

    //  Here stack name is mentioned as aniket* just for fun in Coding

    public static void main(String args[]) {
        String str = "{[()]}";
        System.out.println(isBalanced(str));
    }
}