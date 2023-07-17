package Lec11.TwoDimensionalArrays;

public class HW_Q3_MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(matrixDiagonalSum(arr));
    }

    private static int matrixDiagonalSum(int[][] arr){
        int sum = 0, n = arr.length;
        for(int i = 0; i<n; i++){
            sum+=arr[i][i];
            if(i!=n-1-i){
                sum+=arr[i][n-1-i];
            }
        }
        return sum;
    }
}
