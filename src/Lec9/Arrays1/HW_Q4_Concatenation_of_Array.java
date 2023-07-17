package Lec9.Arrays1;

public class HW_Q4_Concatenation_of_Array {
    // ref: https://leetcode.com/problems/concatenation-of-array/

    public static void main(String[] args) {
        printArr(getConcatenation(new int [] {1,3,2,1}));
    }

    private static int[] getConcatenation(int[] nums) {
        int[] ans = new int [2*nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = ans[nums.length + i] = nums[i];
        }
        return ans;
    }

    private static void printArr(int[] nums){
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
