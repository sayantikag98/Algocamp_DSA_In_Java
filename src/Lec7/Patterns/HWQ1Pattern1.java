package Lec7.Patterns;

import java.util.Scanner;

public class HWQ1Pattern1 {
    /*
        Q.Pattern
            (n=6)
            1
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1
            1 5 10 10 5 1
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){
            System.out.println((int)Math.pow(11, row-1));
        }
    }
}
