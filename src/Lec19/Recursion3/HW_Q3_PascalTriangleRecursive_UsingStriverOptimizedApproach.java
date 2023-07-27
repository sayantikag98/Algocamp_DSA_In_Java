package Lec19.Recursion3;

public class HW_Q3_PascalTriangleRecursive_UsingStriverOptimizedApproach {
    public static void main(String[] args) {
        pascalTriangle(9, 0, 0, 1);
    }

    private static void pascalTriangle(int n, int row, int col, int ans){
        //base case for row
        if(row == n) return;
        //base case for col
        if(col > row){
            System.out.println();
            pascalTriangle(n, row+1, 0, 1);
        }
        else{
            if(col!=0){
                ans*=(row+1-col);
                ans/=col;
            }
            System.out.print(ans+" ");
            pascalTriangle(n, row, col+1, ans);
        }
    }
}
