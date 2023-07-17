package Lec5;

public class LReverseANo {
    public static void main(String[] args) {

        /*
            * For loop should be used when we know the exact number of iterations
            * While/Do While loop should be used when we don't know the exact number of iterations
         */
        int num = 12340, revNum = 0;
        while(num>0){
            int digit = num%10;
            revNum = revNum*10+digit;
            num/=10;
        }
        System.out.println(revNum);
    }
}
