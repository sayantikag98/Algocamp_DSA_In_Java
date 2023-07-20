package Lec18.Recursion2;

public class CheckPalindromeInArray {
    public static void main(String[] args) {
        int[] arr = {5,3,1,3,10};
        System.out.println(isPalindrome(arr, 0));
    }

    private static boolean isPalindrome(int[] arr, int idx){
        //base case
        if(idx>(arr.length-1)/2) return true;
        //recursive task
        boolean isNextSubArrayPalindrome = isPalindrome(arr, idx+1);
        //self work
        return isNextSubArrayPalindrome && arr[idx] == arr[arr.length - 1 - idx];
    }
}
