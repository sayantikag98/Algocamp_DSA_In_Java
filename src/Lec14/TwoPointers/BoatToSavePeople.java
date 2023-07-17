package Lec14.TwoPointers;

import java.util.Arrays;

public class BoatToSavePeople {
    public static void main(String[] args) {
        int[] people = {2,1,3,5,3,4};
        int limit = 5;
        System.out.println(numberRescueBoats(people, limit));
    }

    private static int numberRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int i = 0, j = people.length-1;
        while(i<=j){
            if(people[i] + people[j]<=limit) i++;
            j--;
            count+=1;
        }
        return count;

        //TC => O(nlogn)
        //SC => O(logn)
        /*
         In Java, Arrays.sort() is implemented using a variant of
         the Quick Sort algorithm which has a space complexity
         of O(logn)
        */
    }
}
