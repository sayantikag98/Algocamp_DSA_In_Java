package Lec14.TwoPointers;

public class Sort0And1 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,1,0,1,0,1,0,1};
        sortZeroAndOne(nums);
        printArr(nums);
    }

    private static void sortZeroAndOne(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
            if(arr[j] == 1){
                j--;
            }
            if(arr[i] == 0){
                i++;
            }
        }
    }

    private static void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
