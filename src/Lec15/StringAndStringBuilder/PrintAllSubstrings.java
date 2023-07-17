package Lec15.StringAndStringBuilder;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        printAllSubstrings("code");
    }

    private static void printAllSubstrings(String str) {
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<str.length()+1; j++){  // +1 is very imp to get all the substrings
                System.out.println(str.substring(i, j));
            }
        }
    }
}
