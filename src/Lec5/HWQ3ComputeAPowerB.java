package Lec5;

import java.util.Scanner;

public class HWQ3ComputeAPowerB {
    /*
        Q. Given two numbers a and b, write a program using for loops to calculate a^b.

        Eg1. Input: a=4 b=2
             Output: 16

        Eg2. Input: a=3 b=5
             Output: 243
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), ans = 1;

        for(int i = 1; i<=b; i++){
            ans *= a;
        }

        System.out.println(ans);

    }
}
