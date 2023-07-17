package Lec10.Arrays2.ArrayList;
import java.util.ArrayList;

public class AddTwoArray {
    public static void main(String[] args){
        //use arraylist when we don't know beforehand what will be the size of the array
        int[] arr1 = {9,9};
        int[] arr2 = {9,9,9};
        System.out.println(addTwoArrays1(arr1, arr2));
        System.out.println(addTwoArrays2(arr1, arr2));
        System.out.println(addTwoArrays3(arr1, arr2));
    }

    private static ArrayList<Integer> addTwoArrays1(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr1.length-1, j = arr2.length-1, carry = 0;
        while(i>=0 && j>=0){
            int sum = arr1[i] + arr2[j] + carry;
            int rem = sum%10;
            carry = sum/10;
            ans.add(0, rem);
            i--;
            j--;
        }
        while(i>=0){
            int sum = arr1[i] + carry;
            int rem = sum%10;
            carry = sum/10;
            ans.add(0, rem);
            i--;
        }
        while(j>=0){
            int sum = arr2[j] + carry;
            int rem = sum%10;
            carry = sum/10;
            ans.add(0, rem);
            j--;
        }
        if(carry>0) ans.add(0, carry);
        return ans;
    }

    private static ArrayList<Integer> addTwoArrays2(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr1.length-1, j = arr2.length-1, carry = 0;
        while(i>=0 && j>=0){
            int sum = arr1[i--] + arr2[j--] + carry;
            carry = sum/10;
            ans.add(sum%10);
        }
        while(i>=0){
            int sum = arr1[i--] + carry;
            carry = sum/10;
            ans.add(sum%10);
        }
        while(j>=0){
            int sum = arr2[j--] + carry;
            carry = sum/10;
            ans.add(sum%10);
        }
        if(carry>0) ans.add(carry);
        reverse(ans);
        return ans;
    }

    private static void reverse(ArrayList<Integer> ans){
        int i = 0, j = ans.size()-1;
        while(i<j){
            swap(ans, i++, j--);
        }
    }

    private static void swap(ArrayList<Integer> ans, int i, int j){
        int temp = ans.get(i);
        ans.set(i, ans.get(j));
        ans.set(j, temp);
    }

    private static ArrayList<Integer> addTwoArrays3(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr1.length-1, j = arr2.length-1, carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0) sum+=arr1[i--];
            if(j>=0) sum+=arr2[j--];
            carry = sum/10;
            ans.add(sum%10);
        }
        if(carry>0) ans.add(carry);
        reverse(ans);
        return ans;
    }
}
