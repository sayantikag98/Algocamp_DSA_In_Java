package Lec15.StringAndStringBuilder;

public class ReplaceASCII {
    public static void main(String[] args) {
        System.out.println(replaceAscii(new String("cdEfG")));
    }

    private static String replaceAscii(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i<sb.length(); i++){
            int ascii = sb.charAt(i); //implicit type casting
            if((i&1)==0) ascii++;
            else ascii--;
            sb.setCharAt(i, (char)ascii); //explicit type casting
        }
        return sb.toString();
    }
}
