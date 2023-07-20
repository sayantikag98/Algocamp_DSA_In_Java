package Lec18.Recursion2;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {5,1,2,3,2,10};
        System.out.println("Before Reverse");
        printArray(arr);
        reverseArray(arr, 0);
        System.out.println("After Reverse");
        printArray(arr);
    }

    private static void reverseArray(int[] arr, int idx){
        //base case
        if(idx > (arr.length-1)/2) return;
        //recursive task
        reverseArray(arr, idx+1);
        //self work
        swap(arr, idx, arr.length-1-idx);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private static void printArray(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }


}
