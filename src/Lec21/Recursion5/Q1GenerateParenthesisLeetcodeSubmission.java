package Lec21.Recursion5;

import java.util.*;

//Ref: https://leetcode.com/problems/generate-parentheses/
public class Q1GenerateParenthesisLeetcodeSubmission {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    private static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateCombination(n, 0, 0, "", ans);
        return ans;
    }

    private static void generateCombination(int n, int opening, int closing, String output, List<String> ans){
        if(closing == n){
            ans.add(output);
            return;
        }
        //opening braces
        if(opening<n){
            generateCombination(n, opening+1, closing, output+"(", ans);
        }
        //closing braces
        if(closing<opening){
            generateCombination(n, opening, closing+1, output+")", ans);
        }
    }
}
