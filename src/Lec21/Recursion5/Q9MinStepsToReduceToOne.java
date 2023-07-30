package Lec21.Recursion5;

public class Q9MinStepsToReduceToOne {
    public static void main(String[] args) {
        System.out.println(minSteps(10));
    }

    private static int minSteps(int n){
        if(n==1) return 0;

        int ans = Integer.MAX_VALUE;

        if(n>1 && n%3==0){
            ans = Math.min(ans, minSteps(n/3));
        }
        if(n>1 && n%2==0){
            ans = Math.min(ans, minSteps(n/2));
        }
        if(n>1){
            ans = Math.min(ans, minSteps(n-1));
        }
        return ans+1;
    }
}
