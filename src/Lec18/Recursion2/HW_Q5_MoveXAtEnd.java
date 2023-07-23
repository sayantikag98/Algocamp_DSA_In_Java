package Lec18.Recursion2;

public class HW_Q5_MoveXAtEnd {
    public static void main(String[] args) {
        String str = "abexexdexed";
        System.out.println(moveXAtEnd(str, 0, "", ""));
        moveXAtEndWithPrint(str, 0, "", "");
    }

    private static String moveXAtEnd(String str, int idx, String ans, String xstr){
        if(idx == str.length()) return ans+xstr;
        if(str.charAt(idx) == 'x')
            return moveXAtEnd(str, idx+1, ans, xstr+str.charAt(idx));
        return moveXAtEnd(str, idx+1, ans+str.charAt(idx), xstr);
    }

    private static void moveXAtEndWithPrint(String str, int idx, String ans, String xstr){
        if(idx == str.length()){
            System.out.println(ans+xstr);
            return;
        }
        if(str.charAt(idx) == 'x')
            moveXAtEndWithPrint(str, idx+1, ans, xstr+str.charAt(idx));
        else
            moveXAtEndWithPrint(str, idx+1, ans+str.charAt(idx), xstr);
    }
}
