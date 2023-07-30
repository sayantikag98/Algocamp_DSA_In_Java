package Lec20.Recursion4;

public class HW_Q3_WordsSmallerThanGivenString {
    public static void main(String[] args) {
        printAllLargerRearrangement("dcf", 0, "");
    }

    private static void printAllLargerRearrangement(String str, int idx, String ans){
        if(ans.length() == str.length()){
            if(isFirstStringLarger(ans, str)){
                System.out.println(ans);
            }
            return;
        }
        for(int k = 0; k<=ans.length(); k++){
            printAllLargerRearrangement(str, idx+1, ans.substring(0, k) + str.charAt(idx) + ans.substring(k));
        }
    }

    private static boolean isFirstStringLarger(String str1, String str2){
        for(int i = 0; i<str1.length(); i++){
            if(str1.charAt(i)>str2.charAt(i)) return true;
            if(str1.charAt(i)<str2.charAt(i)) return false;
        }
        return false;
    }
}
