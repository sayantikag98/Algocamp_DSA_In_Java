package Lec24.SelectionBubbleAndInsertionSort;
import static Lec24.SelectionBubbleAndInsertionSort.SelectionSort.printArr;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        System.out.println("Before sorting");
        printArr(nums);
        insertionSort(nums);
        System.out.println("After sorting");
        printArr(nums);
    }

    private static void insertionSort(int[] nums){
        //i points at the start of unsorted region
        for(int i = 1; i<nums.length; i++){
            //store the first element of the unsorted region
            int temp = nums[i], j = i-1;
            /*
            comparison of temp should start from the end of the sorted region
            till the element smaller or lesser than temp is reached
             or if that element is not found then temp is placed at the
             start of the array
             */
            for(; j>=0 && nums[j]>temp; j--){
                nums[j+1] = nums[j];
            }
            nums[j+1] = temp;
        }
    }
}
