package Lec19.Recursion3;

import java.util.ArrayList;
import java.util.List;

//Ref: https://leetcode.com/problems/pascals-triangle/

public class Leetcode118PascalTriangle {
    public static void main(String[] args) {
        int numRows = 7;
        printArr(generate(numRows));
    }

    private static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ansList = new ArrayList<>();
        pascalTriangle(numRows, 0, 0, 1L, ansList, new ArrayList<>());
        return ansList;
    }

    private static void pascalTriangle(int n, int row, int col, long ans, List<List<Integer>> ansList, ArrayList<Integer> colList){
        //base case for row
        if(row == n) return;
        //base case for col
        if(col>row){
            ansList.add(colList);
            pascalTriangle(n, row+1, 0, 1, ansList, new ArrayList<>());
        }
        else{
            if(col != 0){
                ans*=row+1-col;
                ans/=col;
            }
            colList.add((int)ans);
            pascalTriangle(n, row, col+1, ans, ansList, colList);
        }
    }

    private static void printArr(List<List<Integer>> arr){
        for(List<Integer> i: arr){
            for(int j: i){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
