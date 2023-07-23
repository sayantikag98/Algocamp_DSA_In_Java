package Lec18.Recursion2;

public class HW_Q2_StringNumAsInterger {
    public static void main(String[] args) {
        String str = "1234767690";
        System.out.println(stringAsInteger(str, str.length()-1));
    }

    private static int stringAsInteger(String str, int idx){
        //recursion moving from right to left
        if(idx<0) return 0;
        return stringAsInteger(str, idx-1)*10 + str.charAt(idx) - '0';
    }
}
