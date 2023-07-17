package Lec7.Patterns;

import java.util.Scanner;

public class LQ7Pattern7 {
    /*
        Q. Pattern
            n=7
            *     *
            **   **
            *** ***
            *******
            *** ***
            **   **
            *     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1, nsp = n-2;
        for(int row = 1; row<=n; row++){
            if(row != n/2+1){
               for(int i = 1; i<= nst; i++){
                   System.out.print("*");
               }
               for(int i = 1; i<=nsp; i++){
                   System.out.print(" ");
               }
               for(int i = 1; i<= nst; i++){
                   System.out.print("*");
               }
            }
            else{
                for(int i = 1; i<= n; i++){
                    System.out.print("*");
                }
            }

            System.out.println();
            if(row<=n/2){
                nst++;
                nsp-=2;
            }
            else{
                nst--;
                nsp+=2;
            }
        }
    }
}
