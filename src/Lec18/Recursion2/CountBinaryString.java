package Lec18.Recursion2;

public class CountBinaryString {
    public static void main(String[] args) {
        System.out.println(countBinaryString(4));
    }

    private static int countBinaryString(int num){
        if(num==1 || num==2) return num+1;
        return countBinaryString(num - 1)+countBinaryString(num - 2);
    }
}
