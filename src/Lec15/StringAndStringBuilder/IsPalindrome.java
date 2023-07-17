package Lec15.StringAndStringBuilder;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(new String("madam madam")));
    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length()-1;
        while(i<j){
            if(str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }
}
