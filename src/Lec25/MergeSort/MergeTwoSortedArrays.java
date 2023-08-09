package Lec25.MergeSort;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,5,7,10};
        int[] arr2 = {2,3,9,12,16};
        printArr(mergeTwoSortedArrays(arr1, arr2));
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
       int m = arr1.length, n = arr2.length, i = 0, j = 0, k = 0;
       int[] ans = new int [m+n];
       while(i<m && j<n){
           if(arr1[i]<=arr2[j]){ //<= imp here for stability
               ans[k++] = arr1[i++];
           }
           else{
               ans[k++] = arr2[j++];
           }
       }
       while(i<m){
           ans[k++] = arr1[i++];
       }
       while(j<n){
           ans[k++] = arr2[j++];
       }
       return ans;
    }


    public static void printArr(int [] nums){
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
