package Lec9.Arrays1;
import java.util.Scanner;

public class RotateArrayRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = {1,2,3,4,5};
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
        int k = sc.nextInt();
        k%=n;
        if(k<0) k+=n;
        printArr(arr, n);
        rotateArrayKTimes(arr, n, k);
        printArr(arr, n);
    }

    private static void rotateArrayKTimes(int[] arr, int n, int k){
        reverseArrayWithinRange(arr, 0, n-1);
        reverseArrayWithinRange(arr, 0, k-1);
        reverseArrayWithinRange(arr, k, n-1);
    }

    private static void reverseArrayWithinRange(int[] arr, int i, int j){
        while(i<j){
            swap(arr, i++, j--);
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArr(int[] arr, int n){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
