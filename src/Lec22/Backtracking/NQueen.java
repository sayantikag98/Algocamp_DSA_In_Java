package Lec22.Backtracking;
import static Lec22.Backtracking.RatInAMaze.printMaze;

public class NQueen {
    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };

        nQueen(board, 0, 0, 0);
    }

    private static boolean nQueen(int[][] board, int i, int j, int count){
        //count -> total no of queens placed on board
        // count == board.length(n) then there is one possible solution
        if(count == board.length){
            printMaze(board);
            System.out.println("______________");
            return false;
            /*
             returning false is imp for getting all possible solutions
             return true will only get the first possible solution
             the reason for this that when count reaches n then if it returns true
             then it doesn't backtrack (line -> if(!ans) board[i][j] = 0;) to get all
             possible solutions
             */
        }

        //bounds check
        //checking i is not required bcoz that will be taken care by the first base case
        if(j==board.length) return false;

        // place a queen only if it's safe
        if(isSafe(board, i, j)){
            //place a queen
            board[i][j] = 1;
            /*
            once a queen is placed move to the next row and column should start
            from 0 and also increase the count of queens placed
             */
            boolean ans = nQueen(board, i+1, 0, count+1);
            //backtrack only when all the columns of that row (i) has returned false
            if(!ans) board[i][j] = 0;
        }
        //for traversing the entire columns of that ith row if not safe
        //if the entire column returns false then backtrack and move to the next column of that row
        return nQueen(board, i, j+1, count);
    }

    private static boolean isSafe(int[][] board, int i, int j){

        /*
        check for 1 to be present in the top-left diagonal, column and top-right diagonal in the rows above i
        if it is then it is not safe (returns false) otherwise safe (returns true)
        Checking the current row and the rows below it is useless bcoz no queens would be present there
        ALways check the rows above the current row
         */

        //row always decreases
        //top-left diagonal -> column decreases
        //column -> column remains same
        //top-right -> column increases

        //column
        for(int k = i-1; k>=0; k--){
            if(board[k][j] == 1) return false;
        }

        //top-left diagonal
        int m = i-1, n = j-1;
        while(m>=0 && n>=0){
            if(board[m--][n--] == 1) return false;
        }

        //top-right diagonal
        m = i-1;
        n = j+1;
        while(m>=0 && n<board.length){
            if(board[m--][n++] == 1) return false;
        }

        return true;
    }
}
