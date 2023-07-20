package Lec18.Recursion2;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArrayFromLeftToRight(arr, 0);
        System.out.println("______________________________");
        printArrayFromRightToLeft(arr, 0);
    }

    private static void printArrayFromLeftToRight(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]);
        printArrayFromLeftToRight(arr, idx+1);
    }

    private static void printArrayFromRightToLeft(int[] arr, int idx){
        if(idx == arr.length) return;
        printArrayFromRightToLeft(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
