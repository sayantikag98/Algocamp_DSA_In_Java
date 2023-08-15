package Lec22.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
//        solveSudoku(board, 0, 0);
        solveSudokuLeetcode(board, 0, 0);
        printBoard(board);
    }

    private static void solveSudoku(char[][] board, int i, int j) {
        if(i==board.length){
            printBoard(board);
            return;
        }

        if(j==board.length){
            solveSudoku(board, i+1, 0);
        }
        else{
            if(board[i][j] == '.'){
                for(int iter = 1; iter<10; iter++){
                    char ch = Integer.toString(iter).charAt(0);
                    if(isSafe(board, i, j, ch)){
                        board[i][j] = ch;
                        solveSudoku(board, i, j+1);
                        board[i][j] = '.';
                    }
                }
            }
            else solveSudoku(board, i, j+1);
        }
    }

    private static boolean solveSudokuLeetcode(char[][] board, int i, int j) {
        if(i==board.length){
            return true;
        }
        if(j==board.length){
            return solveSudokuLeetcode(board, i+1, 0);
        }
        else{
            if(board[i][j] == '.'){
                for(int iter = 1; iter<10; iter++){
                    char ch = Integer.toString(iter).charAt(0);
                    if(isSafe(board, i, j, ch)){
                        board[i][j] = ch;
                        boolean ans = solveSudokuLeetcode(board, i, j+1);
                        /*
                        ****** MADE A MAJOR MISTAKE HERE ******
                        * if the ans is true means you are able to fill the cell
                        * with a number so return true and if the answer is false then backtrack
                        * and try filling the cell with other numbers and "don't return" if ans = false
                         */
                        if(ans) return true;
                        board[i][j] = '.';
                    }
                }
                return false;
            }
            return solveSudokuLeetcode(board, i, j+1);
        }
    }

    private static boolean isSafe(char[][] board, int i, int j, char ch){

        //row and column
        for(int k = board.length-1; k>=0; k--){
            if(board[i][k] == ch || board[k][j] == ch) return false;
        }

        i-=i%3;
        j-=j%3;

        //grid
        for(int k = 0; k<3; k++){
            for(int l = 0; l<3; l++){
                if(board[i+k][j+l] == ch) return false;
            }
        }

        return true;
    }

    private static void printBoard(char[][] board){
        for(char[] row: board){
            for(char ele: row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println("______________________");
    }
}
