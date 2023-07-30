package Lec21.Recursion5;

public class Q2NFriendsPairing {
    public static void main(String[] args) {
        System.out.println(nFriendsPairing(2));
    }

    private static int nFriendsPairing(int n){
        //base case
        if(n==0 || n==1 || n==2) return n;
        //nth friend decide to remain single
        //whatever ways n-1 friends form pairing
        int remainSingle = nFriendsPairing(n-1);
        //nth friend decide to form a pair
        //nth friend can form a pair n-1 friends and the rest n-2 friends can form the pairing
        int formPair = (n-1) * nFriendsPairing(n-2);

        return remainSingle + formPair;
    }
}
