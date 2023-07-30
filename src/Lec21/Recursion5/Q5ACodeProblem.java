package Lec21.Recursion5;

public class Q5ACodeProblem {
    private static final char[] encoding = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                                      'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                                      'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                                      'Y', 'Z'};
    public static void main(String[] args) {
        printAllDecode("123", 0, "");
    }

    private static void printAllDecode(String str, int idx, String ans){
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }

        //Every digit in the string is considered individually for the decoding
        printAllDecode(str, idx+1, ans+encoding[(str.charAt(idx)-'0')-1]);

        //Every digit except the last digit(do check this otherwise string index out of bound exception) can be considered paired with the next adjacent digit
        //but when paired the range should be from 1 to 26
        if(idx<str.length()-1){
            int doubleCode = Integer.parseInt(str.substring(idx, idx+2))-1;  //-1 is imp bcoz the encoding array is from 0 to 25
            if(doubleCode<26){
                printAllDecode(str, idx+2, ans+encoding[doubleCode]);
            }
        }
    }
}
