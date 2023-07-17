package Lec5;
import java.util.Scanner;

public class HWQ1SumOfOddDigitsAndEvenDigits {
    /*
    Q. Take N as input. Print the sum of its odd digits and the sum of its even digits. (Here we have to consider the sum of the odd and even digits and not the sum of odd and even indices)

    Eg1. Input: 6993
         Output: 21 6
         Explanation: Sum of odd digits: 9 + 9 + 3 -> 21 and Sum of even digits: 6

    Eg2. Input: 1223912
         Output: 14 6
         Explanation: Sum of odd digits: 1 + 3 + 9 + 1 -> 14 and Sum of even digits: 2 + 2 + 2 -> 6

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp = num, sumOfOddDigits = 0, sumOfEvenDigits = 0;

        while(temp > 0){
            int digit = temp%10;
            if(digit % 2 == 0)
                sumOfEvenDigits+=digit;
            else
                sumOfOddDigits+=digit;
            temp/=10;
        }

        System.out.println(sumOfOddDigits+" "+sumOfEvenDigits);
    }
}
