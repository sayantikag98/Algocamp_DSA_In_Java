package Lec19.Recursion3;

public class PrintAllSubsequence {
    //Subsequence does not maintain the contiguous part but maintains the default order
    public static void main(String[] args) {
        printAllSubsequence("abc", 0, "");
    }

    private static void printAllSubsequence(String str, int idx, String output){
        //base case
        if(idx == str.length()){
            System.out.println(output);
            return;
        }
        //recursive task
        //when current index character gets included in the output string
        printAllSubsequence(str, idx+1, output+str.charAt(idx));
        //when current index character does not get included in the output string
        printAllSubsequence(str, idx+1, output);
    }
}

