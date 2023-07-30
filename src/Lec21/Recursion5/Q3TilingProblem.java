package Lec21.Recursion5;

public class Q3TilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }

    private static int tilingProblem(int num){
        if(num == 1 || num == 2) return num;
        // ways to place tile vertically
        int noOfWaysToTileVertically = tilingProblem(num-1);
        // ways to place tile horizontally
        int noOfWaysToTileHorizontally = tilingProblem(num-2);
        return noOfWaysToTileVertically + noOfWaysToTileHorizontally;
    }
}
