package Lec20.Recursion4;

public class MoveInAMazeRevision {
    public static void main(String[] args) {
        System.out.println(moveInAMaze(3,3,0,0, ""));
    }

    private static int moveInAMaze(int n, int m, int i, int j, String ans){
        if(i==n-1 && j==m-1){
            System.out.println(ans);
            return 1;
        }
        if(i==n || j == m) return 0;

        //go right
        int waysRight = moveInAMaze(n, m, i, j+1, ans+"R");

        //go down
        int waysDown = moveInAMaze(n, m, i+1, j, ans+"D");

        return waysDown + waysRight;
    }
}
