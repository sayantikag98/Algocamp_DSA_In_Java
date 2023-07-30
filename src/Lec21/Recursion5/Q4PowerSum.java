package Lec21.Recursion5;

import java.util.ArrayList;

//Ref: https://www.hackerrank.com/challenges/the-power-sum/problem
public class Q4PowerSum {

    public static void main(String[] args) {
        System.out.println(powerSum(13, 2));
    }

    private static int powerSum(int X, int N) {
        // Write your code here
        printWays(X, N, 0, 0, new ArrayList<>());
        return countWays(X, N, 0, 0);
    }

    /*
    In this problem two things are important:
    1. Finding the range of numbers
    2. Problem is exactly similar to finding subsequences
     */

    private static int countWays(int X, int N, int num, int sum){

        //range of numbers whose Nth power sum would be equal to X is [1, X^(1/2)]
        if(num * num > X)
            return 0;
        if(sum>X)
            return 0;
        if(sum == X)
            return 1;

        // Nth power of num+1 is included in the sum
        int includedSum = countWays(X, N, num+1, sum+(int)Math.pow(num+1, N));
        // Nth power of num+1 is excluded from the sum
        int excludedSum = countWays(X, N, num+1, sum);

        return includedSum+excludedSum;
    }

    private static void printWays(int X, int N, int num, int sum, ArrayList<Integer> ans){
        if(num * num > X) return;
        if(sum > X) return;
        if(sum == X){
            System.out.println(ans);
            return;
        }

        //Nth power of num+1 included in sum
        ans.add(num+1);
        printWays(X, N, num+1, sum+(int)Math.pow(num+1, N), ans);

        //Nth power of num+1 excluded from sum
        ans.remove(ans.size()-1);
        printWays(X, N, num+1, sum, ans);
    }
}
