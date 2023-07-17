package Lec9.Arrays1;

import java.util.HashSet;

public class HW_Q2_Contains_Duplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int []{1,2,3,4,5}));
    }

    /**
     * Ref: <a href="https://leetcode.com/problems/contains-duplicate/">Link</a>
     * <br>
     * Question:
     * 217. Contains Duplicate
     * Given an integer array nums, return true if any value appears
     * at least twice in the array, and return false if every element
     * is distinct.
     * <br><br>
     * Input 1:
     * <br>
     * nums = [1,2,3,1]
     * <br><br>
     * Expected Output 1:
     * <br>
     * true
     * <br>
     * Input 2:
     <br>
     * nums = [1,2,3,4]
     *<br><br>
     * Expected Output 2:
     * <br>
     * false
     * <hr><br>
     * Approach 1: Sort the array and traverse to see if duplicate is present
     * TC=>O(nlogn) SC=O(1)
     * <br><br>
     * Approach 2: Traverse through the array and store the element if not present
     * (HashSet is better here than HashMap consumes less memory)
     * TC=>O(n) SC=>O(n)
     * <br><br>
     */
    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> freq = new HashSet<>();
        for(int i: nums){
            if(!freq.add(i)) return true;
        }
        return false;
    }
}
