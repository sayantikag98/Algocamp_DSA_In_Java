package Lec22.Backtracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = new int[][]{
                {1,0,0,0},
                {1,1,1,1},
                {0,1,0,1},
                {0,1,1,1}
        };
        System.out.println(ratInAMaze(maze, 0, 0, ""));
        printMaze(maze);
    }

    private static boolean ratInAMaze(int[][] maze, int i, int j, String str){
        if(i==maze.length-1 && j==maze[0].length-1){
            maze[i][j] = -1;
            System.out.println(str);
            return true;
        }
        if(i<0 || i==maze.length || j<0 || j==maze[0].length || maze[i][j]!=1) return false;

        //do
        maze[i][j] = -1;

        //recurse
        boolean ans = ratInAMaze(maze, i+1, j, str+"D");
        boolean ans1 = ratInAMaze(maze, i, j+1, str+"R");

        //undo
        if(!(ans || ans1)) maze[i][j] = 1;

        return ans || ans1;
    }

    private static void printMaze(int[][] maze){
        for(int[] row: maze){
            for(int ele: row){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
    }
}
