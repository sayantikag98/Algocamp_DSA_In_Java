package Lec19.Recursion3;
import java.util.Scanner;

public class HW_Q4_FindLastOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(findLastOccurrence(0, arr, m));
    }

    private static int findLastOccurrence(int idx, int[] arr, int m){
        if(idx==arr.length) return -1; // did not find any occurrence
        int occurrence = findLastOccurrence(idx+1, arr, m);
        if(occurrence == -1 && arr[idx] == m) return idx;
        return occurrence;
    }

}
