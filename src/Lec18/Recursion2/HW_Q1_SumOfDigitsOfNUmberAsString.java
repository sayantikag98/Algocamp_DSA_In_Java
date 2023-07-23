package Lec18.Recursion2;

public class HW_Q1_SumOfDigitsOfNUmberAsString {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("5123", 0));
    }

    private static int sumOfDigits(String str, int idx){
        if(idx == str.length()) return 0;
        return str.charAt(idx) - '0' + sumOfDigits(str, idx+1);
    }

}

