package Lec19.Recursion3;

public class RemoveOccurrencesOfX {
    public static void main(String[] args) {
        removeChar("abcxcx", 0, 'x', "");
    }

    private static void removeChar(String str, int idx, char ch, String output){
        //base case
        if(idx == str.length()){
            System.out.println(output);
            return;
        }
        if(str.charAt(idx) != ch) removeChar(str, idx+1, ch, output+str.charAt(idx));
        else removeChar(str, idx+1, ch, output);
    }
}
