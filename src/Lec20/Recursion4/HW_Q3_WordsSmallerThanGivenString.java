package Lec20.Recursion4;

import java.util.ArrayList;

public class HW_Q3_WordsSmallerThanGivenString {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        printAllRearrangement("dcf", 0, arr , "");
        System.out.println(arr);
    }

    private static void printAllRearrangement(String str, int idx, ArrayList<String> arr, String ans){
        //Here idx == str.length() check is not required because whenever this happens ans.length() will
        //always become equal to str.length()
        if(ans.length() == str.length()){
            arr.add(ans);
            return;
        }
        for(int k = 0; k<=ans.length(); k++){
            printAllRearrangement(str, idx+1, arr, ans.substring(0, k) + str.charAt(idx) + ans.substring(k));
        }
    }
}
