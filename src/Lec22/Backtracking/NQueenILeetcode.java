package Lec22.Backtracking;
import java.util.*;

public class NQueenILeetcode {

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ansList = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nQueen(board, 0, 0, 0, ansList);
        return ansList;
    }

    private static boolean nQueen(char[][] board, int i, int j, int count, List<List<String>> ansList){
        if(count == board.length){
            ArrayList<String> soln = new ArrayList<>();
            for(char[] boardRow: board){
                soln.add(String.valueOf(boardRow));
            }
            ansList.add(soln);
            return false;
        }
        if(j == board.length) return false;

        if(isSafe(board, i, j)){
            board[i][j] = 'Q';
            boolean ans = nQueen(board, i+1, 0, count+1, ansList);
            if(!ans) board[i][j] = '.';
        }

        return nQueen(board, i, j+1, count, ansList);
    }

    private static boolean isSafe(char[][] board, int i, int j){
        //column
        for(int k = i-1; k>=0; k--){
            if(board[k][j] == 'Q') return false;
        }

        //top-left diagonal
        int m = i-1, n = j-1;
        while(m>=0 && n>=0){
            if(board[m--][n--] == 'Q') return false;
        }

        //top-right diagonal
        m = i-1;
        n = j+1;
        while(m>=0 && n<board.length){
            if(board[m--][n++] == 'Q') return false;
        }

        return true;
    }
}
