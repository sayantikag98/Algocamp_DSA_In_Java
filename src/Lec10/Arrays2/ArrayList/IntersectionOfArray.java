package Lec10.Arrays2.ArrayList;

import java.util.ArrayList;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 19, 20, 30, 40, 40, 40, 50};
        int[] arr2 = {15, 16, 17, 18, 20, 25, 30, 30, 40};

        ArrayList<Integer> al = new ArrayList<>();

        int k = 0;
        for(int i = 0; i<arr1.length; i++){
            for(int j = k; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    al.add(arr1[i]);
                    k = j+1;
                    break;
                }
            }
            if(k >= arr2.length){
                break;
            }
        }

        System.out.println(al);
    }
}
