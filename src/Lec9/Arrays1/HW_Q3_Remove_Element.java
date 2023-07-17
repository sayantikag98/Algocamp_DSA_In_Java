package Lec9.Arrays1;

public class HW_Q3_Remove_Element {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {5,6,7,1,2,3,1,9}, 1));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val) count++;
            else nums[i-count] = nums[i];
        }
        return nums.length - count;
    }
}
