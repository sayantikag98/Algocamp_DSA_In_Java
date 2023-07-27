package Lec19.Recursion3;
import java.util.ArrayList;
import java.util.Scanner;

public class HW_Q5_FindAllOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(helperFindAllOccurrences(n, arr, m));
    }

    private static ArrayList<Integer> helperFindAllOccurrences(int n, int[] arr, int m){
        ArrayList<Integer> ans = new ArrayList<>();
        findAllOccurrences(n-1, arr, m, ans);
        return ans;
    }

    private static void findAllOccurrences(int idx, int[] arr, int m, ArrayList<Integer> ans){
        if(idx<0) return;
        findAllOccurrences(idx-1, arr, m, ans);
        if(arr[idx] == m){
            ans.add(idx);
        }
    }
}
