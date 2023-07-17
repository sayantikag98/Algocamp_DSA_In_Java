package Lec11.TwoDimensionalArrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[][] a1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(a1);  //base address of 2d array
        System.out.println(a1[0]); //base address of the 1d array stored at the 0th index

        int[][] arr = new int[3][];

        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[3];

        for(int[] ele: arr){
            for(int i: ele){
                System.out.print(i+" ");
            }
            System.out.println();
        }




    }
}
