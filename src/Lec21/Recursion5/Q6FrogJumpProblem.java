package Lec21.Recursion5;

public class Q6FrogJumpProblem {
    public static void main(String[] args) {
        System.out.println(frogJump(new int[]{30, 10, 60, 10, 60, 50}, 0));
    }

    private static int frogJump(int[] arr, int idx){
        if(idx == arr.length-1) return 0;

        //when frog makes one stone jump
        int ans = Math.abs(arr[idx] - arr[idx+1]) + frogJump(arr, idx+1);


        /*
        when the frog makes 2 stone jump but that is only possible
        when the frog is not currently at last but one stone
        */
        if(idx<arr.length-2){
            int next2StoneCost = Math.abs(arr[idx]-arr[idx+2]) + frogJump(arr, idx+2);
            ans = Math.min(ans, next2StoneCost);
        }

        return ans;
    }
}
