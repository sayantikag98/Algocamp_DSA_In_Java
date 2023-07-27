package Lec20.Recursion4;
import java.util.List;
import java.util.ArrayList;

//Ref: https://leetcode.com/problems/lexicographical-numbers/
public class LexicographicalNumber {
    public static void main(String[] args) {
        System.out.println(lexicalOrder(33));
    }

    private static List<Integer> lexicalOrder(int num){
        List<Integer> ans = new ArrayList<>();
        lexicalOrderRecursive(num, 0, ans);
        return ans;
    }

    private static void lexicalOrderRecursive(int n, int i, List<Integer> ans){
        //when the number is greater than given n return
        if(i>n) return;
        //always print first and then go to the recursive call
        if(i!=0) ans.add(i);
        for(int k = 0; k<10; k++){
            //when i=0 don't go to the recursive call for k=0 otherwise same call for 0 would be made again and again
            if(i==0 && k==0) continue;
            lexicalOrderRecursive(n, 10*i+k, ans);
        }
    }


}
