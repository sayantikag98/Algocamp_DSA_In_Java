package Lec24.SelectionBubbleAndInsertionSort;
import static Lec24.SelectionBubbleAndInsertionSort.BubbleSort.swap;
import static Lec24.SelectionBubbleAndInsertionSort.SelectionSort.printArr;

public class RecursiveBubbleSort {

    private static int count = 0;

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println("Before sorting");
        printArr(nums);
        recursiveBubbleSort(nums);
        System.out.println("After sorting");
        printArr(nums);

        System.out.println("__________________");
        //best case optimized bubble sort
        count = 0;
        int[] nums1 = {1,2,3,4,5,6,7,8};
        System.out.println("Before sorting");
        printArr(nums1);
        optimizedRecursiveBubbleSort(nums1);
        System.out.println("After sorting");
        printArr(nums1);
    }

    private static void recursiveBubbleSort(int[] nums){
        recursiveBubbling(nums, 0,  1);
        //here count = n*(n-1)/2 for best case if array is already sorted
        System.out.println("Total comparisons: " +count);
    }

    private static void optimizedRecursiveBubbleSort(int[] nums){
        optimizedRecursiveBubbling(nums, 0, 1, false);
        //here count = n-1 for best case if array is already sorted
        System.out.println("Total comparisons: " +count);
    }

    private static void recursiveBubbling(int[] nums, int i, int j){
        if(i == nums.length-1) return;
        if(j == nums.length-i){
            recursiveBubbling(nums, i+1, 1);
        }
        else{
            /*
            count is only for visualizing the total comparisons made and how optimized version
            is better in best case if we have isSwapped variable
            not required for usual code
             */
            count++;
            if(nums[j-1]>nums[j]){
                swap(nums, j-1, j);
            }
            recursiveBubbling(nums, i, j+1);
        }
    }

    private static void optimizedRecursiveBubbling(int[] nums, int i, int j, boolean isSwapped){
        if(i == nums.length-1) return;
        if(j == nums.length - i) {
            if(!isSwapped && i==0) return;
            optimizedRecursiveBubbling(nums, i+1, 1,false);
        }
        else{
            /*
            count is only for visualizing the total comparisons made and how optimized version
            is better in best case if we have isSwapped variable
            not required for usual code
             */
            count++;

            //compare nums[j-1] and nums[j], swap if nums[j-1] is greater than nums[j]
            if(nums[j-1]>nums[j]){
                isSwapped = true;
                swap(nums, j-1, j);
            }
            optimizedRecursiveBubbling(nums, i,j+1,isSwapped);
        }
    }
}
