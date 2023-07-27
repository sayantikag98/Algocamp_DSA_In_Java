package Lec20.Recursion4;

public class MoveInMaze {

    public static void main(String[] args) {
        /*
        Given a mXn board, you are in the top-left corner of the board, in how many
        ways can you reach the bottom-right corner of the board?
        [Allowed movement: rightward and downward]
         */
        int m = 3, n = 3;
        System.out.println(possibleWaysToMoveInAMaze(m, n, 0, 0, ""));
    }

    private static int possibleWaysToMoveInAMaze(int m, int n, int i, int j, String possibleWays){
        //when outside board
        if(i==m || j==n) return 0;
        //when we reached destination
        if(i==m-1 && j==n-1){
            System.out.println(possibleWays);
            return 1;
        }
        //go down increase row but col remains same
        int downWays = possibleWaysToMoveInAMaze(m, n, i+1, j, possibleWays+"D");
        //go right increase col but row remains same
        int rightWays = possibleWaysToMoveInAMaze(m, n, i, j+1, possibleWays+"R");

        return downWays+rightWays;
    }
}
