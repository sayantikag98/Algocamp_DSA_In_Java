package Lec7.Patterns;

import java.util.Scanner;

public class LQ3Pattern3 {

    /*
        Q. Pattern

           n=7 (n is always odd)
           *
           **
           ***
           ****
           ***
           **
           *

           row = 1 | star = 1
           row = 2 | star = 2
           row = 3 | star = 3
           row = 4 | star = 4
           row = 5 | star = 3
           row = 6 | star = 2
           row = 7 | star = 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1;

        for(int row = 1; row <= n; row++){
            //work for the current row

            //print the number of stars
            for(int i = 1; i<=nst; i++){
                System.out.print("*");
            }

            //prep for the next row
            System.out.println();
            if(row<=n/2) nst++;
            else nst--;
        }


    }
}
