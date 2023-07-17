package Lec10.Arrays2.ArrayList;
import java.util.ArrayList;

public class IntersectionOfArrayRevise {
    public static void main(String[] args) {
        int[] arr1 = {10, 19};
        int[] arr2 = {15, 16, 17, 18, 20, 25, 30, 30};
        System.out.println(intersectionOfArray(arr1, arr2));
    }

    private static ArrayList<Integer> intersectionOfArray(int[] arr1, int[] arr2){
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                al.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]) i++;
            else j++;
        }
        return al;
    }
}
