package Lec7.Patterns;

import java.util.Scanner;

public class LQ2Pattern2 {

    /*
        Q. n=5
                *
               ***
              *****
             *******
            *********

            row = 1 | star = 1 | space = 4
            row = 2 | star = 3 | space = 3
            row = 3 | star = 5 | space = 2
            row = 4 | star = 7 | space = 1
            row = 5 | star = 9 | space = 0
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int row = 1, nsp = num - 1, nst = 1;

        while(row<=num){
            // print the number of spaces
            for(int i = 1; i<=nsp; i++){
                System.out.print(" ");
            }
            // print the number of stars
            for(int i = 1; i<=nst; i++){
                System.out.print("*");
            }

            System.out.println();
            row++;
            nsp--;
            nst+=2;
        }

//        for(; row<=num; row++){
//            // print the number of spaces
//            for(int i = 1; i<=nsp; i++){
//                System.out.print(" ");
//            }
//            // print the number of stars
//            for(int i = 1; i<=nst; i++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//            nsp--;
//            nst+=2;
//        }
    }
}
