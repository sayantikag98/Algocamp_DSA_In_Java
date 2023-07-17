package Lec4;

import java.util.Scanner;

public class HWFindingRootsOfQuadraticEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        Q> Write a program to find the roots of a quadratic equation. The standard form of a quadratic equation ax^2 + bx + c = 0.

        Input: a = 8, b = -4, c = -2
        Output: Root1: 0.80
                Root2: -0.30

         Hint: root1 is (-b + √(b^2 - 4ac))/2a
         and root2 is (-b - √(b^2 - 4ac))/2a

         possible edge cases:
         1. if b^2 - 4ac is negative
         */

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double root1, root2;

        double resIntermediate = Math.sqrt((Math.pow(b,2)) - 4 * a * c);
        if(resIntermediate>=0){
            root1 = (-b + resIntermediate)/(2*a);
            root2 = (-b - resIntermediate)/(2*a);
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);
        }
        else{
            System.out.println("finding root not possible as it is imaginary");
        }


    }
}
