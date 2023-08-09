package Lec22.Backtracking;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        permutationsRecursive("abc", "");
        System.out.println("________________");
        permutationsBacktracking(new StringBuilder("abc"), 0);
        System.out.println(swap1("abc", 1,2));
    }

    private static void permutationsRecursive(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            /*
            suppose str is "abc"
            when the length of the str is 3 then
                        value of i          str for next recursive call
                                        (str.substring(0,i)+str.substring(i+1))

                            0                  ""+"bc"
                            1                  "a"+"c"
                            2                  "ab"+""
             */
            permutationsRecursive(str.substring(0, i)+str.substring(i+1), ans+str.charAt(i));
        }
    }

    private static void permutationsBacktracking(StringBuilder str, int idx){
        if(idx == str.length()){
            System.out.println(str);
            return;
        }

        for(int i = idx; i<str.length(); i++){
            swap(str, idx, i);
            permutationsBacktracking(str, idx+1);
            swap(str, idx, i);
        }

    }

    private static void swap(StringBuilder str, int i, int j){
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }

    private static String swap1(String str, int i, int j){
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
//        return new String(arr);
    }


}
