package Lec36.ProblemSolvingStack1;
import java.util.Stack;

//Ref: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("x"));
    }

    private static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }
            else st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
