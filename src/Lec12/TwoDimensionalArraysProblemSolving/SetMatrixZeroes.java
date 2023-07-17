package Lec12.TwoDimensionalArraysProblemSolving;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setMatrixZeroes(arr);
        printArray(arr);
    }

    private static void setMatrixZeroes(int[][] matrix){
        int row = matrix.length, col = matrix[0].length;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(matrix[i][j] == 0)
                    makeZeros(matrix, i, j, row, col);
            }
        }

    }

    private static void makeZeros(int[][] matrix, int rowNo, int colNo, int row, int col) {
        for(int i = 0; i<row; i++){
            matrix[i][colNo] = 0;
        }
        for(int j = 0; j<col; j++){
            matrix[rowNo][j] = 0;
        }
    }

    private static void printArray(int[][] arr){
        for(int[] arrRow: arr){
            for(int arrEle: arrRow){
                System.out.print(arrEle+" ");
            }
            System.out.println();
        }
    }
}
