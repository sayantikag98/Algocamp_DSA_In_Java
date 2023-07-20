package Lec19.Recursion3;

public class Pattern1 {
    public static void main(String[] args) {
        printPattern1(5, 0, 0);
        printPattern2(5, 0, 0);
        printPattern3(5, 0, 0);
    }

    private static void printPattern1(int n, int row, int col){
        if(row==n) return;
        if(col==n){
            System.out.println();
            printPattern1(n, row+1, 0);
        }
        else{
            System.out.print("* ");
            printPattern1(n, row, col+1);
        }
    }

    private static void printPattern2(int n, int row, int col){
        if(row==n) return;
        if(col>row){
            System.out.println();
            printPattern2(n, row+1, 0);
        }
        else{
            System.out.print("* ");
            printPattern2(n, row, col+1);
        }
    }

    private static void printPattern3(int n, int row, int col){
        if(row==n) return;
        if(col==n-row){
            System.out.println();
            printPattern3(n, row+1, 0);
        }
        else{
            System.out.print("* ");
            printPattern3(n, row, col+1);
        }
    }
}
