package Lec17.Recursion1;

public class HW_Q4_Climbing_Stairs {

    //Ref: https://leetcode.com/problems/climbing-stairs/
    public static void main(String[] args) {
        System.out.println(climbingStairs(4));
    }
    private static int climbingStairs(int n){
        int a = 1, b = 1;
        for(int i = 2; i<=n; i++){
            b = a+b;
            a = b-a;
        }
        return b;
    }
}
