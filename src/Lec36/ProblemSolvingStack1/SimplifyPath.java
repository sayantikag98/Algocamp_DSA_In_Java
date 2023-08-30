package Lec36.ProblemSolvingStack1;
import java.util.Stack;

//Ref: https://leetcode.com/problems/simplify-path/
public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("///_///../foo//"));
    }

    private static String simplifyPath(String path) {
        String[] splitPath = path.split("/");
        Stack<String> st = new Stack<>();
        for(String p: splitPath){
            if(!p.isEmpty() && !p.equals(".") && !p.equals("..")) st.add(p);
            if(!st.isEmpty() && p.equals("..")) st.pop();
        }
        StringBuilder sb = new StringBuilder();
        if(st.isEmpty()) sb.append("/");
        for(String val: st){
            sb.append("/");
            sb.append(val);
        }
        return sb.toString();
    }
}
