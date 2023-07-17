package Lec7.Patterns;

import java.util.Scanner;

public class HWQ4Pattern4 {
    /*
        Q. Pattern
            (n=5)
            1
            212
            32123
            4321234
            543212345
            4321234
            32123
            212
            1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col = 1, val = 1;
        for(int row = 1; row<=2*n-1; row++){
            // work for the current row
            for(int i = 1; i<=col; i++){
                System.out.print(val);
                if(i<=col/2){
                    val--;
                }
                else{
                    val++;
                }
            }
            System.out.println();
            if(row<=(2*n-1)/2){
                col+=2;
            }
            else{
                val = 2*n-row-1;
                col-=2;
            }
        }
    }
}
