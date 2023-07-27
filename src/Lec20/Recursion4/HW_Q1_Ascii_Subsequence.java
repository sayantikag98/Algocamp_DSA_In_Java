package Lec20.Recursion4;

public class HW_Q1_Ascii_Subsequence {
    private static int count = 0;
    public static void main(String[] args) {
        asciiSubsequence("abcd", 0, "");
        System.out.println(count);
    }

    private static void asciiSubsequence(String str, int idx, String output){
        if(idx == str.length()){
            System.out.println("["+output+"]");
            count++;
            return;
        }
        asciiSubsequence(str, idx+1, output+str.charAt(idx));
        asciiSubsequence(str, idx+1, output+(int)str.charAt(idx));
        asciiSubsequence(str, idx+1, output);
    }
}
