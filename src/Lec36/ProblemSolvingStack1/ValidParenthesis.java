package Lec36.ProblemSolvingStack1;
import java.util.Stack;

//Ref: https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(}"));
    }

    private static boolean isValid(String s) {
        /*
        condition for pushing into the stack:
        1. opening parenthesis
        2. closing parenthesis when the peek element present
           in the stack is not the corresponding opening parenthesis
           eg: closing parenthesis is ')' and the element present at
           peek of the stack is NOT THE CORRESPONDING OPENING PARENTHESIS '('

        condition for popping into the stack:
        1. closing parenthesis when the peek element present
           in the stack is the corresponding opening parenthesis
           eg: closing parenthesis is ')' and the element present at
           peek of the stack is THE CORRESPONDING OPENING PARENTHESIS '('

        finally if the stack is empty then it is valid parenthesis otherwise its invalid
         */
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch == ']' && !st.isEmpty() && st.peek() == '[') ||
                    (ch == '}' && !st.isEmpty() && st.peek() == '{') ||
                    (ch == ')' && !st.isEmpty() && st.peek() == '(')){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
