package Lec20.Recursion4;

public class HW_Q4_WordsLargerThanGivenString {
    public static void main(String[] args) {
        printSmallerThanGivenString("dfc", 0, "");
    }

    private static void printSmallerThanGivenString(String str, int idx, String ans){
        if(str.length() == ans.length()){
            if(isFirstStringSmaller(ans, str)){
                System.out.println(ans);
            }
            return;
        }

        for(int i = 0; i<=ans.length(); i++){
            printSmallerThanGivenString(str, idx+1, ans.substring(0, i) + str.charAt(idx) + ans.substring(i));
        }
    }

    private static boolean isFirstStringSmaller(String str1, String str2){
        for(int i = 0; i<str1.length(); i++){
            if(str1.charAt(i)<str2.charAt(i)) return true;
            if(str1.charAt(i)>str2.charAt(i)) return false;
        }
        return false;
    }
}


