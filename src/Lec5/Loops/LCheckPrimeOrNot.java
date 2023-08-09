package Lec5.Loops;

import java.util.Scanner;

public class LCheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<num; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }

        int n = 10;
        System.out.println(n);
    }
}
