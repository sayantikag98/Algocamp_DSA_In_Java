package Lec17.Recursion1;

public class Recursion1 {
    public static void main(String[] args) {
//        System.out.println(factorial(6));
        System.out.println(power(2,3));
//        printIncreasing(5);
//        printDecreasing(5);
//        printDecreasingIncreasing(5);
    }

    public static int factorial(int num){
        //recurrence relation => f(n) = n * f(n-1)
        //base case
        if(num == 0 || num == 1) return 1;
        //assumption & self work
        return num * factorial(num-1);
    }

    private static int power(int a, int b){
        // recurrence relation => f(a, b) = a * f(a, b-1)
        // base case
        if(b == 0) return 1;
        // assumption
        int aPowerBMinusOne = power(a, b-1);
        // self work
        return a * aPowerBMinusOne;
    }

    private static void printIncreasing(int num){
        if(num == 0) return;
        printIncreasing(num-1);
        System.out.println(num);
    }

    private static void printDecreasing(int num){
        if(num==0) return;
        System.out.println(num);
        printDecreasing(num-1);
    }

    private static void printDecreasingIncreasing(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printDecreasingIncreasing(num-1);
        System.out.println(num);
    }
}
