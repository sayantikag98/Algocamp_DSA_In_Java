package Lec19.Recursion3;
import java.util.*;

public class PrintAllPermutations {
    public static void main(String[] args) {
        printAllPermutation("123", 0, "");

        //Ref: https://leetcode.com/problems/permutations/
        System.out.println(permute(new int[]{1,2,3}));
    }

    private static void printAllPermutation(String str, int idx, String ans){
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<=ans.length(); i++){
            printAllPermutation(str, idx+1, ans.substring(0, i)+str.charAt(idx)+ans.substring(i));
        }
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permuteRecursive(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private static void permuteRecursive(int[] nums, int idx, List<Integer> arr, List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }

        for(int i = 0; i<=arr.size(); i++){
            arr.add(i, nums[idx]);
            permuteRecursive(nums, idx+1, arr, ans);
            arr.remove(i);
        }
    }
}
