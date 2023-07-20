package Lec17.Recursion1;

public class HW_Q3_FibonnaciNumber {

    //Ref: https://leetcode.com/problems/fibonacci-number/

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
    private static int fibonacci(int n){
        if(n<=1) return n;
        int a = 0, b = 1;
        for(int i = 2; i<=n; i++){
            b = a+b;
            a = b-a;
        }
        return b;
    }
}
