package Lec18.Recursion2;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4};
        System.out.println(maxInArray(arr, 0));
        System.out.println(minInArray(arr, 0));
    }

    private static int maxInArray(int[] arr, int idx) {
        //Base case
        if(idx == arr.length-1) return arr[idx];
//        if(idx == arr.length) return Integer.MIN_VALUE;
        //Recursive task/Assumption
        int maxTillNow = maxInArray(arr, idx+1);
        //Self-work
        return Math.max(arr[idx], maxTillNow);
    }

    private static int minInArray(int[] arr, int idx){
        //Base case
//        if(idx == arr.length) return Integer.MAX_VALUE;
        if(idx == arr.length-1) return arr[idx];
        //Recursive task/Assumption
        int minTillNow = minInArray(arr, idx+1);
        //self work
        return Math.min(arr[idx], minTillNow);
    }
}
