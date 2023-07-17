package Lec9.Arrays1;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1};

        int n = arr.length;

//        reverse1(arr, n);
        reverse2(arr, n);

    }

    private static void reverse1(int[] arr, int n){
        print(arr);
        int i = 0, j = n-1;
        while(i<j){
            swap(arr, i++, j--);
        }
        print(arr);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse2(int[] arr, int n){
        print(arr);
        for(int i = 0; n>0 && i<=(n-1)/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        print(arr);
    }

    private static void print(int[] arr){
        if(arr.length == 0){
            System.out.println("The given array is empty");
            return;
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
