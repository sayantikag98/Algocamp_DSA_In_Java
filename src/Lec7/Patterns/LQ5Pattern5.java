package Lec7.Patterns;
import java.util.Scanner;

public class LQ5Pattern5 {
    /*
        Q.Pattern
            n=5
            *
           ***
          *****
           ***
            *

          row = 1 | star = 1 | space = 2
          row = 2 | star = 3 | space = 1
          row = 3 | star = 5 | space = 0
          row = 4 | star = 3 | space = 1
          row = 5 | star = 1 | space = 2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1, nsp = n/2;

        for(int row = 1; row<=n; row++){
           for(int i = 1; i<=nsp; i++){
               System.out.print(" ");
           }
           for(int i = 1; i<=nst; i++){
               System.out.print("*");
           }
           System.out.println();
           if(row<=n/2){
               nst+=2;
               nsp--;
           }
           else {
               nst -= 2;
               nsp++;
           }
        }
    }
}
