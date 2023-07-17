package Lec14.TwoPointers;

public class TwoSum2InputArraySorted {
    public static void main(String[] args) {
        printArr(twoSum2(new int []{2,7,11,15}, 9));
    }

    private static int[] twoSum2(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum==target) return new int[] {i+1, j+1};
            else if(sum>target) j--;
            else i++;
        }
        return new int[] {-1, -1};
    }

    private static void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
