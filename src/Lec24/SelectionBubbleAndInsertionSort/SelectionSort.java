package Lec24.SelectionBubbleAndInsertionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,1,3,2,4};
        System.out.println("Before Sorting");
        printArr(nums);
        selectionSort(nums);
        System.out.println("After Sorting");
        printArr(nums);
    }

    private static void selectionSort(int[] arr){
        /* iterate from 0 to n-2
            At every iteration:
           1. find out the minimum element of the unsorted region
           2. swap that with the first element of unsorted region
           3. mark this as the last element of sorted region
        */

        for(int i = 0; i<arr.length-1; i++){
            //find minimum element index from [i, n-1]
            int minIndex = getMinimumIndex(arr, i);
            //swap arr[i] && arr[minIndex]
            swap(arr, i, minIndex);
        }

    }

    private static int getMinimumIndex(int[] arr, int i){
        int minIndex = i;
        for(int j = i+1; j<arr.length; j++){
            if(arr[minIndex]>arr[j]){
                minIndex = j;
            }
        }
        return minIndex;
    }

    private static void swap(int[] arr, int i, int minIndex){
        if(minIndex != i){
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int[] nums){
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
