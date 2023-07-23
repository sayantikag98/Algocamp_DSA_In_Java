package Lec18.Recursion2;

public class HW_Q6_ContentBetweenParenthesis {
    public static void main(String[] args) {
        System.out.println(contentBetweenParenthesis("xyz(abc)def", 0, "", false));
        contentBetweenParenthesisWithPrint("(xyzabcdef)", 0, "", false);
    }

    private static String contentBetweenParenthesis(String str, int idx, String ans, boolean isBracket){
        if(idx == str.length())
            return ans;
        if(str.charAt(idx) == '(')
            return contentBetweenParenthesis(str, idx+1, ans, true);
        if(str.charAt(idx) == ')' || !isBracket)
            return contentBetweenParenthesis(str, idx+1, ans, false);
        return contentBetweenParenthesis(str, idx+1, ans+str.charAt(idx), true);
    }

    private static void contentBetweenParenthesisWithPrint(String str, int idx, String ans, boolean isBracket){
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(idx);
        if(ch == '(')
            contentBetweenParenthesisWithPrint(str, idx+1, ans, true);
        else if(ch == ')' || !isBracket)
            contentBetweenParenthesisWithPrint(str, idx+1, ans, false);
        else
            contentBetweenParenthesisWithPrint(str, idx+1, ans+ch, true);
    }
}
