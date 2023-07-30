package Lec21.Recursion5;

public class Q7FrogJumpProblemAnotherVariation {
    public static void main(String[] args) {
        System.out.println(frogJumpMinCost(new int[]{10, 20, 10}, 0, 1));
    }

    private static int frogJumpMinCost(int[] arr, int idx, int k){
        if(idx == arr.length-1) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i<=k; i++){
            if(idx+i<arr.length){
                ans = Math.min(ans, Math.abs(arr[idx]-arr[idx+i])+frogJumpMinCost(arr, idx+i, k));
            }
        }
        return ans;
    }
}
