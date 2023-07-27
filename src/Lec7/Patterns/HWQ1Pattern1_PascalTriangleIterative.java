package Lec7.Patterns;

import java.util.ArrayList;

import static Lec17.Recursion1.Recursion1.factorial;
//import java.util.Scanner;

//recursive method in Lec19.Recursion3

public class HWQ1Pattern1_PascalTriangleIterative {
    /*
        Q.Pattern
            (n=6)
            1
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1
            1 5 10 10 5 1
     */
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        int n = 9;
        pascalTriangle(n);
        pascalTriangleUsingCombination(n);
    }

    private static void pascalTriangleUsingCombination(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(factorial(i)/(factorial(i-j) * factorial(j)) + " ");
            }
            System.out.println();
        }
    }

    private static void pascalTriangle(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        for(int i = 2; i<=n; i++){
            printArr(al);
            al = helper(al);
        }
        printArr(al);
    }

    private static ArrayList<Integer> helper(ArrayList<Integer> al){
        ArrayList<Integer> ans = new ArrayList<>();
        int a = 0, b;
        for(int i: al){
            b = i;
            ans.add(a+b);
            a = b;
        }
        ans.add(1);
        return ans;
    }

    private static void printArr(ArrayList<Integer> al){
        for(int i: al){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
