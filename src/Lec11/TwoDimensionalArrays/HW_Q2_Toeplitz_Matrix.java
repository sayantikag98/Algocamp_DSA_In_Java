package Lec11.TwoDimensionalArrays;

public class HW_Q2_Toeplitz_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {2,1}
        };
        System.out.println(toeplitzMatrix(arr));
    }

    private static boolean toeplitzMatrix(int[][] arr) {
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr[0].length-1; j++){
                if(arr[i][j] != arr[i+1][j+1]) return false;
            }
        }
        return true;
    }
}
