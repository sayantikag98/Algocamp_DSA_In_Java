package Lec11.TwoDimensionalArrays;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        printArr(transpose(arr));
        printArr(transposeSquareMatrix(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }));
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    //works only for square matrix
    private static int[][] transposeSquareMatrix(int[][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = i+1; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    private static void printArr(int[][] matrix){
        for(int[] arr: matrix){
            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
