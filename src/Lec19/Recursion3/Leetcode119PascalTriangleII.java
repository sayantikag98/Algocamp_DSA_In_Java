package Lec19.Recursion3;
import java.util.ArrayList;
import java.util.List;

//Ref: https://leetcode.com/problems/pascals-triangle-ii/
public class Leetcode119PascalTriangleII {
    public static void main(String[] args) {
        printArray(getRow(30));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<Integer>();
        pascalRow(rowIndex, 0, 1L, l);
        return l;
    }

    private static void pascalRow(int n, int col, long ans, List<Integer> colList){
        if(col>n) return;
        if(col>0){
            ans*=n+1-col;
            ans/=col;
        }
        colList.add((int)ans);
        pascalRow(n, col+1, ans, colList);
    }

    private static void printArray(List<Integer> l){
        for(int i: l){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

