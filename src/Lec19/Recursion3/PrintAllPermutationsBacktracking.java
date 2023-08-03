package Lec19.Recursion3;

import java.util.ArrayList;

public class PrintAllPermutationsBacktracking {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permutation(nums, new ArrayList<>());
        permutationSwapping(nums, 0);
    }

    private static void permutation(int[] nums, ArrayList<Integer> ans){

        if(ans.size() == nums.length){
            System.out.println(ans);
            return;
        }

        for(int i: nums){
            if(!ans.contains(i)) {
                ans.add(i);
                permutation(nums, ans);
                ans.remove(ans.size() - 1);
            }
        }
    }

    private static void permutationSwapping(int[] nums, int idx){
        if(idx==nums.length){
            printArr(nums);
            return;
        }

        for(int i = idx; i<nums.length; i++){
            swap(nums, idx, i);
            permutationSwapping(nums, idx+1);
            swap(nums, idx, i);
        }

    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void printArr(int[] nums){
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
