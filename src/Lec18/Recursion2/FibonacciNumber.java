package Lec18.Recursion2;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    private static int fibonacci(int num){
        if(num<=1) return num;
        return fibonacci(num - 1)+fibonacci(num - 2);
    }
}
