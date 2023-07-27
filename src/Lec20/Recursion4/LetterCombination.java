package Lec20.Recursion4;

import java.util.ArrayList;
import java.util.List;

//Ref: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombination {
    public static void main(String[] args) {
        List<String> l = letterCombinations("234");
        System.out.println(l);
    }

    private static List<String> letterCombinations(String digits) {
        String[] mapper = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return letterCombinationRecursive(digits, 0, mapper);
    }

    private static ArrayList<String> letterCombinationRecursive(String digits, int idx, String[] mapper){
        if(idx == digits.length()) return new ArrayList<>();
        ArrayList<String> arr = letterCombinationRecursive(digits, idx+1, mapper);
        ArrayList<String> ans = new ArrayList<>();
        /// MADE MISTAKE HERE FOR GETTING STR (LINE 22)
        String str = mapper[digits.charAt(idx) - '0'];
        letterCombinationGivenStringAndArray(str, arr, 0, 0, ans);
        return ans;
    }

    private static void letterCombinationGivenStringAndArray(String str, ArrayList<String> arr, int i, int j, ArrayList<String>ans){
        if(i == str.length()) return;
        if(j == arr.size()){
            /// MADE A MISTAKE HERE DID NOT CHECK FOR WHEN ARR IS EMPTY ARRAY (LINE 32-34)
            /// THIS CONDITION IS VERY IMPORTANT OTHERWISE RETURNS EMPTY ARRAY AS ANSWER
            if(arr.size() == 0){
                ans.add(String.valueOf(str.charAt(i)));
            }
            letterCombinationGivenStringAndArray(str, arr, i+1, 0, ans);
        }
        else{
            ans.add(str.charAt(i) + arr.get(j));
            letterCombinationGivenStringAndArray(str, arr, i, j+1, ans);
        }
    }
}
