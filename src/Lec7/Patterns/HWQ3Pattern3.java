package Lec7.Patterns;

import java.util.Scanner;

public class HWQ3Pattern3 {
    /*
        Q. Pattern
            (n=5)
            * *
            ** **
            *****
            ** **
            * *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        for(int row = 1; row<=n; row++){
            if(row == n/2+1){
                for(int i = 1; i<=n; i++){
                    System.out.print("*");
                }
            }
            else{
                //print the star
                for(int i = 1; i<=nst; i++){
                    System.out.print("*");
                }
                //print one space
                System.out.print(" ");
                //print the star
                for(int i = 1; i<=nst; i++){
                    System.out.print("*");
                }
            }

            System.out.println();
            if(row<=n/2){
                nst++;
            }
            else{
                nst--;
            }
        }
    }
}
