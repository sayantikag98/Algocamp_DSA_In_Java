package Lec7.Patterns;

import java.util.Scanner;

public class LQ4Pattern4 {

    /*
        Q. Pattern
            n=4
            1
            12
            123
            1234
            123
            12
            1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;

        for(int row = 1; row<=2*n-1; row++){
            for(int i = 1; i<=val; i++){
                System.out.print(i);
            }
            System.out.println();
            if(row<n) val++;
            else val--;
        }

    }
}
