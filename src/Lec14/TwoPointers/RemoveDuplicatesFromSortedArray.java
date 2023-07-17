package Lec14.TwoPointers;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesFromSortedArray(nums));
    }

    private static int removeDuplicatesFromSortedArray(int[] nums) {
        int duplicateCount = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]) duplicateCount++;
            else nums[i-duplicateCount] = nums[i];
        }
        return nums.length-duplicateCount;
    }

    private static int removeDuplicatesFromSortedArrayUsingTwoPointers(int[] nums){
        int ins = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[ins++] = nums[i];
            }
        }
        return ins;
    }
}
