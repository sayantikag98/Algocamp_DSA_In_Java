package Lec5;

import java.util.Scanner;

public class HWQ4SimpleCalculator {

    /*
        Q. Write a program that works as a simple calculator. It reads two integer and a character.
        If the character is a +, the sum is printed.
        If the character is a -, the difference is printed.
        If the character is a *, the product is printed.
        If the character is a /, the quotient is printed.
        If the character is a %, the remainder is printed.
        If the user enter a 'X' or 'x', the program exits otherwise again asks for two numbers and a new operation.
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a = sc.nextInt();
        System.out.println("Enter the second no");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char ch = sc.next().charAt(0);

        while(ch !='x' && ch != 'X'){
            switch (ch) {
                case '+' -> System.out.println(a + b);
                case '-' -> System.out.println(a - b);
                case '*' -> System.out.println(a * b);
                case '/' -> System.out.println(a / b);
                case '%' -> System.out.println(a % b);
            }
            System.out.println("Enter the first no");
            a = sc.nextInt();
            System.out.println("Enter the second no");
            b = sc.nextInt();
            System.out.println("Enter the operator");
            ch = sc.next().charAt(0);
        }

    }
}
