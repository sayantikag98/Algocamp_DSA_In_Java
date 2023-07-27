package Lec19.Recursion3;

import java.util.Scanner;

public class HW_Q6_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isPalindrome(arr, 0, n));
    }

    private static boolean isPalindrome(int[] arr, int idx, int n){
        if(idx == n/2) return true;
        boolean isPalindromeTillNow = isPalindrome(arr, idx+1, n);
        return isPalindromeTillNow && arr[idx] == arr[n - 1 - idx];
    }

}
