package Lec4;
import java.util.Scanner;

public class HWFindingWhetherTriangleEquilateralScaleneOrIsoceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Q> Given three sides of a triangle check whether it is equilateral, isoceles or scalene.
         */

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if(a+b>c || b+c>a || a+c>b){
            if(a == b && b == c){
                System.out.println("Triangle is equilateral Triangle");
            }
            else if(a == b || b == c || c == a){
                System.out.println("Triangle is isoceles Triangle");
            }
            else{
                System.out.println("Triangle is scalene Triangle");
            }
        }
        else{
            System.out.println("It is not a triangle");
        }
    }
}
