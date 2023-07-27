package Lec19.Recursion3;

import java.util.Scanner;

public class HW_Q7_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, n);
        printArray(arr);
    }

    private static void reverseArray(int[] arr, int idx, int n){
        if(idx == n/2) return;
        reverseArray(arr, idx+1, n);
        swap(arr, idx, n-1-idx);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
