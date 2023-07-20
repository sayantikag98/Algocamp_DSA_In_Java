package Lec18.Recursion2;

public class FirstAndLastOccurrenceOfTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,0};
        System.out.println(firstOccurrence(arr, 0, 2));
        System.out.println(lastOccurrence(arr, 0, 2));
    }

    private static int firstOccurrence(int[] arr, int idx, int target) {
        //base cases
        if(idx == arr.length) return -1;
        if(arr[idx] == target) return idx;
        //self work + recursive step
        return firstOccurrence(arr, idx+1, target);
    }

    private static int lastOccurrence(int[] arr, int idx, int target){
        //base cases
        if(idx == arr.length) return -1;
        //recursive task
        int occurrenceIndex = lastOccurrence(arr, idx+1, target);
        //self work
        if(occurrenceIndex == -1 && arr[idx] == target) return idx;
        return occurrenceIndex;

    }
}
