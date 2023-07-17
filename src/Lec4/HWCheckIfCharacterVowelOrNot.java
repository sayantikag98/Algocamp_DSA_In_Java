package Lec4;

import java.util.Scanner;

public class HWCheckIfCharacterVowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Q> Given a character find out whether it is a vowel or consonant
         */

        char ch = sc.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }

}
