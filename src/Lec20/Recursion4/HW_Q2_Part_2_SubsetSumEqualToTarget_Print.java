package Lec20.Recursion4;

import java.util.ArrayList;

public class HW_Q2_Part_2_SubsetSumEqualToTarget_Print {
    public static void main(String[] args) {
        printSubsetSumEqualToTarget(new int[]{5,1,2,4,9,7}, 0, new ArrayList<>(), 0, 7);
    }
    private static void printSubsetSumEqualToTarget(int[] arr, int idx, ArrayList<Integer> ans, int sum, int target){
        if(idx == arr.length){
            if(sum == target){
                System.out.println(ans);
            }
            return;
        }

        // add the current index element to answer
        ans.add(arr[idx]);
        printSubsetSumEqualToTarget(arr, idx+1, ans, sum+arr[idx], target);

        //remove the current index element from answer
        ans.remove(ans.size()-1);
        printSubsetSumEqualToTarget(arr, idx+1, ans, sum, target);
    }
}
