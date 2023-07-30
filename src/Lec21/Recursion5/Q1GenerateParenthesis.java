package Lec21.Recursion5;

//Ref: https://leetcode.com/problems/generate-parentheses/
public class Q1GenerateParenthesis {
    public static void main(String[] args) {
        generateParenthesis(3, 0, 0, "");
    }

    private static void generateParenthesis(int n, int o, int c, String ans){
        if(o==c && o==n){
            System.out.println(ans);
            return;
        }
        if(o>n || c>n || c>o){
            return;
        }
        //opening parenthesis
        generateParenthesis(n, o+1, c, ans+"(");
        //closing parenthesis
        generateParenthesis(n, o, c+1, ans+")");
    }
}
