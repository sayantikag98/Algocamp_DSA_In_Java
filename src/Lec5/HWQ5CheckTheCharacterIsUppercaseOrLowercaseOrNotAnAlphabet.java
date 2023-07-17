package Lec5;

import java.util.Scanner;

/*
    Q. Take as input a character, print 'U' if its uppercase, 'L' if its lowercase and 'I' if its not an alphabet.

    Eg1. Input: D
         Output: U

    Eg2. Input: 9
         Output: I

    Eg3. Input: e
         Output: L
 */

public class HWQ5CheckTheCharacterIsUppercaseOrLowercaseOrNotAnAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 65 && ch <= 90)
            System.out.println('U');
        else if(ch >= 97 && ch <= 122)
            System.out.println('L');
        else
            System.out.println('I');
    }
}
