package Lec20.Recursion4;

import java.util.ArrayList;
import java.util.List;

//Ref: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombination_Sanket_Approach {
    public static void main(String[] args) {
        System.out.println(letterCombinations("2344"));

    }

    private static List<String> letterCombinations(String digits) {
        String[] mapper = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        letterCombinationRecursive(digits, 0, "", mapper, ans);
        return ans;
    }

    private static void letterCombinationRecursive(String str, int idx, String output, String[] mapper, List<String>ans){
        //base case
        if(str.length() == 0) return;
        if(idx == str.length()){
            ans.add(output);
            return;
        }
        String mappedString = mapper[str.charAt(idx)-'0'];
        for(int k = 0; k<mappedString.length(); k++){
            letterCombinationRecursive(str, idx+1, output+mappedString.charAt(k), mapper, ans);
        }
    }
}
