package Lec19.Recursion3;

public class HW_Q2_Pattern2 {
    public static void main(String[] args) {
        printPattern(5, 0, 0);
    }

    private static void printPattern(int n, int row, int col){
        if(row == n) return;
        if(col == n-row){
            System.out.println();
            printPattern(n, row+1, 0);
        }
        else{
            System.out.print("*");
            printPattern(n, row, col+1);
        }
    }
}
