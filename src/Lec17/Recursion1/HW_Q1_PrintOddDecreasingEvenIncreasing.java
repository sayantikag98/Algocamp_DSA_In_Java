package Lec17.Recursion1;

public class HW_Q1_PrintOddDecreasingEvenIncreasing {
    public static void main(String[] args) {
        int num = 6;
        printOddDecreasingEvenIncreasing(num-1);
    }

    private static void printOddDecreasingEvenIncreasing(int n){
        if(n==0) return;
        if((n&1)==1) System.out.print(n+" ");
        printOddDecreasingEvenIncreasing(n-1);
        if((n&1)==0) System.out.print(n+" ");
    }
}
