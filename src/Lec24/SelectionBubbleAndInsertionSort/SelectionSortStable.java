package Lec24.SelectionBubbleAndInsertionSort;

import static Lec24.SelectionBubbleAndInsertionSort.SelectionSort.printArr;

public class SelectionSortStable {
    public static void main(String[] args) {
        int[] nums = {2,4,2,1};
        System.out.println("Before sorting");
        printArr(nums);
        selectionSortStable(nums);
        System.out.println("After sorting");
        printArr(nums);
    }

    private static void selectionSortStable(int[] nums){
        int n = nums.length;
        for(int i = 0; i<n-1; i++){
            //find min element index from [i, n-1]
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(nums[j]<nums[minIndex]) minIndex = j;
            }
            //store the minIndex element
            int temp = nums[minIndex];
            //shift elements from i to minIndex-1 to its next place
            //always run this loop in reverse order
            for(int k = minIndex; k>i; k--){
                nums[k] = nums[k-1];
            }
            //place minIndex element at its correct position
            nums[i] = temp;
        }
    }
}
