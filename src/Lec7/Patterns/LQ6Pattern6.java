package Lec7.Patterns;

import java.util.Scanner;

public class LQ6Pattern6 {
    /*
        Q. Pattern
            n=4
            *******
            *** ***
            **   **
            *     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = n-1, nsp = 1;
        for(int row = 1; row<=n; row++){
            if(row == 1){
                for(int i = 1; i<=2*n-1; i++){
                    System.out.print("*");
                }
            }
            else{
                for(int i = 1; i<=nst; i++){
                    System.out.print("*");
                }
                for(int i = 1; i<=nsp; i++){
                    System.out.print(" ");
                }
                for(int i = 1; i<=nst; i++){
                    System.out.print("*");
                }
            }
            System.out.println();
            if(row>=2){
                nst--;
                nsp+=2;
            }

        }


    }
}
