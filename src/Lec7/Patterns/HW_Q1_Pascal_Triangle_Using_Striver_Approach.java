package Lec7.Patterns;

import static Lec17.Recursion1.Recursion1.factorial;

//Ref: https://youtu.be/bR7mQgwQ_o8
public class HW_Q1_Pascal_Triangle_Using_Striver_Approach {
    public static void main(String[] args) {
        int row = 6, col = 3;
        /*
        Q1. Given 1 based row and col give the corresponding number in pascal triangle
         */
            //brute force
            pascalTriangleValueForRowAndColUsing_nCrBruteForce(row-1,col-1);
            //optimized
            pascalTriangleValueForRowAndColUsing_nCrOptimized(row-1,col-1);

            System.out.println();

        /*
        Q2. Given 1 based row print the entire column of that row in pascal triangle
         */
            //brute force
            pascalRowBruteForce(row-1);
            //optimized
            pascalRowOptimized(row-1);

        /*
        Q3. Given the total number of rows (n) print the whole pascal triangle
         */
            //brute force
            pascalTriangleBruteForce(6);
            //optimized
            pascalTriangleOptimized(6);
    }

    private static void pascalTriangleOptimized(int n){
        // n is the total no of rows
        for(int i = 0; i<n; i++){
            pascalRowOptimized(i);
        }
    }

    private static void pascalTriangleBruteForce(int n){
        // n is the total no of rows
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                pascalTriangleValueForRowAndColUsing_nCrOptimized(i, j);
            }
            System.out.println();
        }
    }

    private static void pascalRowOptimized(int row){
        //Given row as 0 based index
        int pascalTriangleValue = 1;
        for(int i = 1; i<=row+1; i++){
            System.out.print(pascalTriangleValue+ " ");
            pascalTriangleValue*=(row+1-i);
            pascalTriangleValue/=i;
        }
        System.out.println();
    }

    private static void pascalRowBruteForce(int row){
        //Give row as 0 based index
        for(int i = 0; i<=row; i++){
            pascalTriangleValueForRowAndColUsing_nCrOptimized(row, i);
        }
        System.out.println();
    }

    private static void pascalTriangleValueForRowAndColUsing_nCrOptimized(int row, int col){
        //Give row and col as 0 based indices
        int ans = 1;
        for(int i = 1; i<=col; i++){
            ans *= row-i+1;
            ans/=i;
        }
        System.out.print(ans+" ");
    }

    private static void pascalTriangleValueForRowAndColUsing_nCrBruteForce(int row, int col){
        //Give row and col as 0 based indices
        System.out.println(factorial(row)/(factorial(row-col) * factorial(col)) + " ");
    }
}
