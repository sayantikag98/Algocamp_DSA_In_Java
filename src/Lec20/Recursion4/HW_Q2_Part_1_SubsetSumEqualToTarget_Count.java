package Lec20.Recursion4;

public class HW_Q2_Part_1_SubsetSumEqualToTarget_Count {
    public static void main(String[] args) {
        System.out.println(countSubsetSumEqualToTarget(new int[]{5,1,2,4,9,7}, 0, 0, 7));
    }

    private static int countSubsetSumEqualToTarget(int[] arr, int idx, int sum, int target){
        if(idx == arr.length){
            if(sum == target){
                return 1;
            }
            return 0;
        }
        int includedCount = countSubsetSumEqualToTarget(arr, idx+1, sum+arr[idx], target);
        int excludedCount = countSubsetSumEqualToTarget(arr, idx+1, sum, target);
        return includedCount+excludedCount;

    }
}
