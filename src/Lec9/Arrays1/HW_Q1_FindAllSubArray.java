package Lec9.Arrays1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HW_Q1_FindAllSubArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        printArray(findAllSubArray(arr));
        printArray(findAllSubArraysOptimized(arr));
    }

    private static ArrayList<ArrayList<Integer>> findAllSubArray(int[] arr){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                ArrayList<Integer> al = new ArrayList<>();
                for(int k = i; k<=j; k++){
                    al.add(arr[k]);
                }
                ans.add(al);
            }
        }
        return ans;
    }

    private static ArrayList<ArrayList<Integer>> findAllSubArraysOptimized(int[] arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<arr.length; i++){
            int size = ans.size(), counter = i;
            for(int j = size-1; counter>0 && j>=0; j--){
                ArrayList<Integer>al = new ArrayList<>(ans.get(j));
                al.add(arr[i]);
                ans.add(al);
                counter--;
            }
            ArrayList<Integer> al1 = new ArrayList<>();
            al1.add(arr[i]);
            ans.add(al1);
        }
        return ans;
    }

    private static void printArray(ArrayList<ArrayList<Integer>> ans){
        System.out.println("__________________________________");
        for(ArrayList<Integer> al: ans){
            for(int i: al){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
