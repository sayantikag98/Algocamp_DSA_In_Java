package Lec18.Recursion2;

public class HW_Q3_CheckStringPalidromeOrNot {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("ad", 0));
    }

    private static boolean checkPalindrome(String str, int idx){
        if(idx == str.length()/2) return true;
        return checkPalindrome(str, idx+1) && str.charAt(idx) == str.charAt(str.length()-1-idx);
    }
}
