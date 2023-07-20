package Lec18.Recursion2;

import java.util.HashMap;

public class HouseRobber {
    //Ref: https://leetcode.com/problems/house-robber/

    private static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        int[] arr = {2, 8};
        hm.put(0, arr[0]);
        //constraint for leetcode
        if(arr.length == 1){
            System.out.println(arr[0]);
        }
        else{
            hm.put(1, Math.max(arr[0], arr[1]));
            System.out.println(rob(arr, arr.length-1));
        }
    }
    private static int rob(int[] nums, int idx) {
        if(!hm.containsKey(idx)){
            int maxWealth = Math.max(rob(nums, idx-1), nums[idx]+rob(nums, idx-2));
            hm.put(idx, maxWealth);
        }
        return hm.get(idx);
    }
}
