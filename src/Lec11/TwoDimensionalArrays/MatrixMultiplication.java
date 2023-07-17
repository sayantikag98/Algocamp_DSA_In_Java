package Lec11.TwoDimensionalArrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1,2,3},
                {4,5,6}
        };

        int[][] mat2 = {
                {1,1},
                {1,2},
                {2,1}
        };

        printArr(matrixMultiplication(mat1, mat2));
    }

    private static int[][] matrixMultiplication(int[][] mat1, int[][]mat2){

        //Matrix multiplication possible if the columns of the first matrix is equal to the rows of the second matrix
        //the resultant matrix would be having the dimension of rows of the first matrix X columns of the second matrix
        int row1 = mat1.length, row2 = mat2.length,
                col1 = mat1[0].length, col2 = mat2[0].length;
        if(col1 != row2){
            System.out.println("Matrix multiplication not possible");
            return new int[1][1];
        }
        else{
            int[][] ans = new int[row1][col2];
            for(int i = 0; i<row1; i++){
                for(int j = 0; j<col2; j++){
                    for(int k = 0; k<col1; k++){
                        ans[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            return ans;
        }
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
