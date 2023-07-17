package Lec11.TwoDimensionalArrays;
import java.util.Scanner;

public class HW_Q1_RichestCustomerWealth {
    public static void main(String[] args) {
        //Ref: https://leetcode.com/problems/richest-customer-wealth/description/
//        int[][] accounts = {
//                {2,8,7},
//                {7,1,3},
//                {1,9,5}
//        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Please enter the number of columns");
        int m = sc.nextInt();
        int[][] accounts = new int[n][m];
        System.out.println("Please enter the matrix");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        System.out.println(richestCustomerWealth(accounts));
    }

    private static int richestCustomerWealth(int[][] accounts){
        int maxWealth = 0;
        for(int[] arr: accounts){
            int sum = 0;
            for(int i: arr){
                sum+=i;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }


}
