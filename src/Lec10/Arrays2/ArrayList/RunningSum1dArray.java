package Lec10.Arrays2.ArrayList;

public class RunningSum1dArray {
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};
        printArray(runningSum(arr));
    }

    private static int[] runningSum(int[] nums) {
        for(int i = 1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }

    private static void printArray(int[] nums){
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
