package Lec25.MergeSort;
import static Lec25.MergeSort.MergeTwoSortedArrays.printArr;
import static Lec25.MergeSort.MergeTwoSortedArrays.mergeTwoSortedArrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5,1,2,4,3,7,6};
        System.out.println("Before sorting");
        printArr(nums);
        mergeSort(nums, 0, nums.length-1);
        System.out.println("After sorting");
        printArr(nums);

        System.out.println("_____________Alternate Implementation____________________");

        int[] nums1 = {5,1,2,4,3,7,10};
        System.out.println("Before sorting");
        printArr(nums1);
        int[] result = mergeSortAlternateImplementation(nums1, 0, nums1.length-1);
        System.arraycopy(result, 0, nums1, 0, result.length);
        System.out.println("After sorting");
        printArr(nums1);
    }

    private static void mergeSort(int[] nums, int low, int high){
        if(low == high) return;

        int mid = low + (high - low)/2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);

        merge(nums, low, mid, high);
    }

    private static void merge(int[] nums, int low, int mid, int high){
        int i = low, j = mid+1, k = 0;
        int[] ans = new int[high-low+1];

        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){ // <= imp for maintaining stability
                ans[k++] = nums[i++];
            }
            else{
                ans[k++] = nums[j++];
            }
        }

        while(i<=mid){
            ans[k++] = nums[i++];
        }

        while(j<=high){
            ans[k++] = nums[j++];
        }

        //copy from ans back to nums from [low, high] v.imp step
//        for(int m = 0; m<ans.length; m++){
//            nums[low+m] = ans[m];
//        }
        System.arraycopy(ans, 0, nums, low, ans.length);
    }

    private static int[] mergeSortAlternateImplementation(int[] nums, int low, int high){
        if(low == high){
            return new int[]{nums[low]};
        }
        int mid = low + (high - low)/2;
        //left sorted subproblem
        int[] left = mergeSortAlternateImplementation(nums, low, mid);
        //right sorted subproblem
        int[] right = mergeSortAlternateImplementation(nums, mid+1, high);
        return mergeTwoSortedArrays(left, right);
    }
}
