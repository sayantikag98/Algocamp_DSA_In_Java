package Lec19.Recursion3;

import java.util.ArrayList;
import static Lec17.Recursion1.Recursion1.factorial;

//iterative way in Lec7.Patterns

public class HW_Q3_PascalTriangleRecursive {
    public static void main(String[] args) {
        int n = 9;
//        pascalTriangle(n, 0, new ArrayList<Integer>());
//        pascalTriangleRecursive(n, 0, new ArrayList<>(), 0, new ArrayList<>());
        pascalTriangleUsingCombination(n, 0, 0);
    }

    private static void pascalTriangleUsingCombination(int n, int row, int col){
        // formula used: rowCcol = row!/(row-col)!*col!

        //base case for row
        if(row == n) return;

        //base case for col
        if(col > row){
            System.out.println();
            pascalTriangleUsingCombination(n, row+1, 0);
        }
        else{
            System.out.print(factorial(row)/(factorial(row-col) * factorial(col)) + " ");
            pascalTriangleUsingCombination(n, row, col+1);
        }
    }

    private static void pascalTriangle(int n, int idx, ArrayList<Integer> al){
        //iterative with one iterative and one recursive method
//        if(idx == n) return;
//        al = helper(al);
//        pascalTriangle(n, idx+1, al);


        //recursive with two recursive method
        if(idx == n) return;
        al = helperRecursive(al, 0, new ArrayList<>());
        pascalTriangle(n, idx+1, al);
    }

    private static void pascalTriangleRecursive(int n, int row, ArrayList<Integer> al, int col, ArrayList<Integer> ans){
        /*
        recursive with single recursive method - my attempted approach
        n = total number of rows of pascal triangle
        row = current row number
        al = ArrayList holding the previous row of pascal triangle on which computation of the current row should be done
        col = current col number
        ans = ArrayList holding the computed value of pascal triangle of the current row
         */

        //base case for row
        if(row == n) return;
        //base case for col
        if(col == al.size()){
            ans.add(1);
            printArr(ans);
            pascalTriangleRecursive(n, row+1, ans, 0, new ArrayList<>());
        }
        else if(col == 0){
            ans.add(1);
        }
        else{
            ans.add(al.get(col) + al.get(col-1));
        }
        if(col<al.size()){
            pascalTriangleRecursive(n, row, al, col+1, ans);
        }
    }

    private static ArrayList<Integer> helperRecursive(ArrayList<Integer> al, int idx, ArrayList<Integer> ans){
        if(idx == al.size()){
            ans.add(1);
            printArr(ans);
            return ans;
        }
        else if(idx == 0){
            ans.add(1);
        }
        else{
            ans.add(al.get(idx) + al.get(idx-1));
        }
        return helperRecursive(al, idx+1, ans);
    }

    private static ArrayList<Integer> helper(ArrayList<Integer> al){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        if(al.size()>0){
            for(int i = 1; i<al.size(); i++){
                ans.add(al.get(i)+al.get(i-1));
            }
            ans.add(1);
        }
        printArr(ans);
        return ans;
    }

    private static void printArr(ArrayList<Integer> al){
        for(int i: al){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}

