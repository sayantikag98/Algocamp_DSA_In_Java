package Lec17.Recursion1;

import java.util.HashMap;

public class HW_Q2_Nth_Tribonacci_Number {

    //Ref: https://leetcode.com/problems/n-th-tribonacci-number/
    private static HashMap<Integer, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        int n = 25;
        hm.put(0,0);
        hm.put(1,1);
        hm.put(2,1);
        System.out.println(tribonacciRecursive(n));
        System.out.println(tribonacciDPTabulation(n));
        System.out.println(tribonacciDPTabulationOptimized(n));
        System.out.println(tribonacciMemoization(n));
    }

    private static int tribonacciRecursive(int n) {
        //base cases
        if(n<=1) return n;
        if(n==2) return n-1;
        //recursive task + self work
        return tribonacciRecursive(n-1) + tribonacciRecursive(n-2) + tribonacciRecursive(n-3);
    }

    private static int tribonacciMemoization(int n){
        if(hm.containsKey(n)) return hm.get(n);
        int num = tribonacciMemoization(n-1) + tribonacciMemoization(n-2) + tribonacciMemoization(n-3);
        hm.put(n, num);
        return num;
    }

    private static int tribonacciDPTabulation(int n){
        if(n<=1) return n;
        if(n==2) return n-1;
        int[] arr = new int [n+1];
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr[n];
    }

    private static int tribonacciDPTabulationOptimized(int n){
        if(n<=1) return n;
        int a = 0, b = 1, c = 1;
        for(int i = 3; i<=n; i++){
            c = a+b+c;
            b = c-(a+b);
            a = c-(a+b);
        }
        return c;
    }
}
