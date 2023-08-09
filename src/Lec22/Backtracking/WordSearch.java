package Lec22.Backtracking;

public class WordSearch {
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

        //do part (set the character to # once visited)
        board[i][j] = '#';

        //recurse part
        /*
        if any of the recursive call (up or right or down or left) returns true means we got the word string
        idx = word.length(), then we should never call the other recursive call below
        That is why there is an if check before every recursive call starting from the second call
         */

        //up
        boolean ansUp = wordSearchBacktracking(board, word, i-1, j, idx+1);
        boolean ansRight = false;
        if(!ansUp){
            //right
            ansRight = wordSearchBacktracking(board, word, i, j+1, idx+1);
        }
        boolean ansDown = false;
        if(!(ansUp || ansRight)){
            //down
            ansDown = wordSearchBacktracking(board, word, i+1, j, idx+1);
        }
        boolean ansLeft = false;
        if(!(ansUp || ansRight || ansDown)){
            //left
            ansLeft = wordSearchBacktracking(board, word, i, j-1, idx+1);
        }

        //undo part (set the character back to the original character
        /*
            call the undo part if and only if all of the above four recursive calls
            (up, right, down, left) returns false
            Then it means there is no path to traverse so backtrack

            If all of the above four recursive calls return false then only return false
            otherwise if any one of them returns true then return true
         */

        if(!(ansUp || ansDown || ansLeft || ansRight)){
            board[i][j] = word.charAt(idx);
            return false;
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
    }
}
