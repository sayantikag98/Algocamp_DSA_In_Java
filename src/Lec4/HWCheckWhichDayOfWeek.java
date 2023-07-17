package Lec4;
import java.util.Scanner;

public class HWCheckWhichDayOfWeek {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
        Q> Write a program to input the week number (1-7) and print the corresponding day of the week

        Input: 1
        Output: Monday

        Input: 6
        Output: Saturday
         */

        int weekNo = sc.nextInt();

        switch(weekNo){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Sunday");
        }

    }
}
