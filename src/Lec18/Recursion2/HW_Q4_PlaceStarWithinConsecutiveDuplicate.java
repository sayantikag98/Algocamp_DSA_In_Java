package Lec18.Recursion2;

public class HW_Q4_PlaceStarWithinConsecutiveDuplicate {
    public static void main(String[] args) {
        System.out.println(placeStarWithinDuplicate("hellllooohplppuiuii", 0, ""));
        placeStarWithinDuplicateWithPrintOnly("hellllooohplppuiuii", 0, "");
    }

    private static String placeStarWithinDuplicate(String str, int idx, String ans){
        if(idx == str.length()) return ans;
        if(idx!=0 && str.charAt(idx)==str.charAt(idx-1))
            return placeStarWithinDuplicate(str, idx+1, ans+'*'+str.charAt(idx));
        return placeStarWithinDuplicate(str, idx+1, ans+str.charAt(idx));
    }

    private static void placeStarWithinDuplicateWithPrintOnly(String str, int idx, String ans){
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }
        if(idx!=0 && str.charAt(idx) == str.charAt(idx-1)){
            placeStarWithinDuplicateWithPrintOnly(str, idx+1, ans+"*"+str.charAt(idx));
        }
        else{
            placeStarWithinDuplicateWithPrintOnly(str, idx+1, ans+str.charAt(idx));
        }
    }
}
