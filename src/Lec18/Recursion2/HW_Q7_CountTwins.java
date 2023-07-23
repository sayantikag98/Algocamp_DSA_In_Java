package Lec18.Recursion2;

public class HW_Q7_CountTwins {
    public static void main(String[] args) {
        System.out.println(countTwins("AxAxAAA", 0, 0));
        countTwinsWithPrint("AxAxAAA", 0, 0);
    }
    private static int countTwins(String str, int idx, int count){
        if(idx == str.length()) return count;
        if(idx>=2 && str.charAt(idx) == str.charAt(idx-2))
            return countTwins(str, idx+1, count+1);
        return countTwins(str, idx+1, count);
    }

    private static void countTwinsWithPrint(String str, int idx, int count){
        if(idx == str.length()){
            System.out.println(count);
            return;
        }
        if(idx>=2 && str.charAt(idx) == str.charAt(idx-2))
            countTwinsWithPrint(str, idx+1, count+1);
        else
            countTwinsWithPrint(str, idx+1, count);
    }
}
