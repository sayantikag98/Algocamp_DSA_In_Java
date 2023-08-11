package Lec22.Backtracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1,0,0,0},
                {1,1,1,1},
                {0,1,0,1},
                {0,1,1,1}
        };
        int[][] soln = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        System.out.println(ratInAMaze(maze, 0, 0, "", soln));
        printMaze(soln);
    }

    private static boolean ratInAMaze(int[][] maze, int i, int j, String str, int[][] soln){
        if(i==maze.length-1 && j==maze[0].length-1){
            soln[i][j] = 1;
            System.out.println(str);
            return true;
        }
        if(i<0 || i==maze.length || j<0 || j==maze[0].length || maze[i][j]!=1) return false;

        //do
        soln[i][j] = 1;

        //recurse
        boolean ans = ratInAMaze(maze, i+1, j, str+"D", soln);
        boolean ans1 = ratInAMaze(maze, i, j+1, str+"R", soln);

        //undo
        if(!(ans || ans1)) soln[i][j] = 0;

        return ans || ans1;
    }

    public static void printMaze(int[][] maze){
        for(int[] row: maze){
            for(int ele: row){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
    }
}
