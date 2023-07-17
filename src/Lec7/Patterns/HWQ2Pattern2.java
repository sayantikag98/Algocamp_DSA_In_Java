package Lec7.Patterns;

import java.util.Scanner;

public class HWQ2Pattern2 {
    /*
        Q.Pattern
            (n=5)
            *********
            *******
            *****
            ***
            *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 2*n-1;

        for(int row = 1; row<=n; row++){
            //print the stars
            for(int i = 1; i<=nst; i++){
                System.out.print("*");
            }

            System.out.println();
            nst-=2;
        }

    }
}
