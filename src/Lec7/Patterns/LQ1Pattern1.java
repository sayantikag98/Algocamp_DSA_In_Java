package Lec7.Patterns;

import java.util.Scanner;

public class LQ1Pattern1 {
    /*
        Q.
            Pattern:
            *
            **
            ***
            ****
            *****
            for n=5
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int row = 1, nst = 1;

        while(row<=num){
            for(int i = 1; i<=nst; i++){
                System.out.print("*");
            }
            row++;
            nst++;
            System.out.println();
        }

    }
}
