package Lec5.Loops;

import java.util.Scanner;

public class HWQ2LargestAndSmallestDigitInANumber {

    /*
    Q. Write a program to find the smallest and the largest digits in a given positive integer value.

    Eg1. Input: 121176
         Output: 1 7

    Eg2. Input: 908822
         Output: 0 9
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp = num,
        maxDigit = Integer.MIN_VALUE, minDigit = Integer.MAX_VALUE;

        while(temp>0){
            int digit = temp % 10;
//            if(maxDigit<digit)
//                maxDigit = digit;
//            if(minDigit>digit)
//                minDigit = digit;
            maxDigit = Math.max(maxDigit, digit);
            minDigit = Math.min(minDigit, digit);
            temp/=10;
        }

        System.out.println(minDigit+" "+maxDigit);
    }

}
