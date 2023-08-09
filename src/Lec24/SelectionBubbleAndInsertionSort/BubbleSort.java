package Lec24.SelectionBubbleAndInsertionSort;
import static Lec24.SelectionBubbleAndInsertionSort.SelectionSort.printArr;


public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println("Before sorting");
        printArr(nums);
        bubbleSort(nums);
        bubbleSortOptimized(nums);
        System.out.println("After sorting");
        printArr(nums);
    }

    private static void bubbleSort(int[] nums){
        int n = nums.length;
        int count = 0;
        //if n-1 elements are sorted then n elements are automatically sorted
        for(int i = 0; i<n-1; i++){
            /*
            for i=0 comparisons and swaps (bubbling) should happen from 0 to n-1
            for i=1 comparisons and swaps (bubbling) should happen from 0 to n-2
            for i=2 comparisons and swaps (bubbling) should happen from 0 to n-3
            and so on...
             */
            for(int j = 1; j<n-i; j++){
                count++;
                if(nums[j-1]>nums[j]){
                    swap(nums, j-1, j);
                }
            }
        }
        //here count = n*(n-1)/2 for best case if array is already sorted
        System.out.println("Total comparisons " +count);
    }

    private static void bubbleSortOptimized(int[] nums){
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n-1; i++){
            //if for one whole iteration of j no swaps happened then the array is already sorted
            boolean isSwapped = false;
            for(int j = 1; j<n-i; j++){
                count++;
                if(nums[j-1]>nums[j]){
                    isSwapped = true;
                    swap(nums, j-1, j);
                }
            }
            if(!isSwapped) break;
        }
        //here count = n-1 for best case if array is already sorted
        System.out.println("Total comparisons " +count);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
