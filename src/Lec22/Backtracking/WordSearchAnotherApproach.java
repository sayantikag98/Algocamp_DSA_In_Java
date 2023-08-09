package Lec22.Backtracking;

public class WordSearchAnotherApproach {
    public static void main(String[] args) {
        char[][] board = {
                {'M','S','C','D','Q'},
                {'N','R','T','C','B'},
                {'R','A','E','D','C'},
                {'Q','R','W','X','S'}
        };
        System.out.println(wordSearch(board, "CTCDE"));
        printBoard(board);
    }

    private static boolean wordSearch(char[][] board, String word){
        /*
        go to every single character and check if that returns true or not
        when every character is traversed and returns false then return false
         */
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(wordSearchBacktracking(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    private static boolean wordSearchBacktracking(char[][] board, String word, int i, int j, int idx){
        //base case 1
        /*
        base case 1 should come before base case 2 bcoz when idx = word.length() then putting base case 2
        before will call board[i][j] != word.charAt(word.length()) which will cause index out of bound exception
         */
        if(idx == word.length()) return true;

        //base case 2 (bound check and check whether the current character is present in word or not
        if(i<0 || i==board.length || j<0 || j==board[0].length || board[i][j] != word.charAt(idx)) return false;

        //do part
        board[i][j] = '#';

        /*
        if any of the call returns true then don't call the other recursive call
         */

        //recurse part
        boolean ans = wordSearchBacktracking(board, word, i-1, j, idx+1) ||
                      wordSearchBacktracking(board, word, i, j+1, idx+1) ||
                      wordSearchBacktracking(board, word, i+1, j, idx+1) ||
                      wordSearchBacktracking(board, word, i, j-1, idx+1);

        //undo part
        /*
        this is only called when all paths return false
         */
        if(!ans){
            board[i][j] = word.charAt(idx);
        }
        return ans;
    }

    private static void printBoard(char[][] board){
        for(char[] row: board){
            for(char ele: row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}

/*
L = length of the word string
M = total rows of board matrix
N = total columns of board matrix
SC = O(L)
TC = O(M*N*4^L)
 */
