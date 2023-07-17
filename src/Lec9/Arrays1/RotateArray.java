package Lec9.Arrays1;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 7, n = arr.length;

        k = k%n;
        
        if(k<0){
            k = n + k;
        }

        print(arr);

        rotateByPart(arr, 0, n-1);
        rotateByPart(arr, 0, k-1);
        rotateByPart(arr, k, n-1);

        print(arr);

    }

    private static void rotateByPart(int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void print(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
