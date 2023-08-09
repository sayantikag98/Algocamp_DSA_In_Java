package Lec4.SwitchCaseAndConditionals;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
//        float fl = 1.0f;
//
//        switch(fl){
//            case 1.0f:
//                System.out.println("hi");
//                break;
//            case 2.0f:
//                System.out.println("bye");
//                break;
//            default:
//                System.out.println("hello");
//        }

        Scanner sc = new Scanner(System.in);

        /*
        Q1> Number is even or odd
         */
//        int inputNum = sc.nextInt();
//
//        if(inputNum%2 == 0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }

        /*
        Q2> Given three angles check whether it is a valid triangle or not
         */

//        int angle1 = sc.nextInt(), angle2 = sc.nextInt(), angle3 = sc.nextInt();
//
//        // condition for a valid triangle: all the angles should be greater than 0 and sum of all angles is 180 degree
//
//        if(angle1>0 && angle2>0 && angle3>0 && angle1 + angle2 + angle3 == 180){
//            System.out.println("Valid Triangle");
//        }
//        else{
//            System.out.println("Invalid Triangle");
//        }

        /*
        Q3> Given a year, print whether it is a leap year or not.
         */

//        int year = sc.nextInt();
//        if((year%4 == 0 && year%100!=0) || year%400==0){
//            System.out.println("Leap Year");
//        }
//        else{
//            System.out.println("Not a leap year");
//        }

        /*
        Q4> Given three integer, print the max.
         */

        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        int max;

        if(num1 > num2 && num1 > num3)
            max = num1;
        else if (num2 > num1 && num2 > num3)
            max = num2;
        else
            max = num3;


        System.out.println("Maximum is "+ max);

        /*
        Q5> Check whether the character is consonant or vowel
        Q6> Given three nos check whether they form an equilateral, isosceles or scalene
        triangle.
        Q7> Given the day of the week find the corresponding day of the week
         */

//        byte b = 128; // compile error -> incompatible types possible lossy conversion from int to byte

    }
}
