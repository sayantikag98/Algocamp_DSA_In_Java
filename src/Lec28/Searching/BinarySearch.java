package Lec28.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5}, 6));
    }

    private static int binarySearch(int[] arr, int target){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid]<target) low = mid+1;
            else high = mid - 1;
        }
        return -1;
    }
}
