package Lec9.Arrays1;

//int min = (int)1e9;

public class MaxOfArray {

    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-7,-5};
        int n = arr.length;

        int max = arr[0];

        for(int i = 1; i<n; i++){
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}
