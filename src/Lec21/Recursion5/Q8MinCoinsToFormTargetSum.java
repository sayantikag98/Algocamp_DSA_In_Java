package Lec21.Recursion5;

public class Q8MinCoinsToFormTargetSum {
    public static void main(String[] args) {
        System.out.println(minCoins(new int[]{1,5,10}, 3, 11));
    }

    private static int minCoins(int[] arr, int n, int x){
        if(x==0) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(x-arr[i]>=0) {
                ans = Math.min(ans, minCoins(arr, n, x - arr[i]));
            }
        }
        return ans+1;
    }
}
