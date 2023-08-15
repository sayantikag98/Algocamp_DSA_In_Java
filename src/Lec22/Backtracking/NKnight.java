package Lec22.Backtracking;

public class NKnight {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nKnight(board, 0, 0, 0);
    }

    private static void nKnight(boolean[][] board, int i, int j, int kpsf){
        if(kpsf == board.length){
            printBoard(board);
            System.out.println("_______________");
            return;
        }
        if(j == board.length) return;

        if(isSafe(board, i, j)){
            board[i][j] = true;
            nKnight(board, i+1, 0, kpsf+1);
            board[i][j] = false;
        }

        nKnight(board, i, j+1, kpsf);
    }

    private static boolean isSafe(boolean[][] board, int i, int j){
        if(i>1 && j>0 && board[i-2][j-1]) return false;
        if(i>1 && j<board.length-1 && board[i-2][j+1]) return false;
        if(i>0 && j>1 && board[i-1][j-2]) return false;
        if(i>0 && j<board.length-2 && board[i-1][j+2]) return false;
        return true;
    }

    private static void printBoard(boolean[][] board){
        for(boolean[] row: board){
            for(boolean ele: row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

}
