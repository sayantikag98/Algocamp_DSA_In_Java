// import java.lang package is not required
import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //implicit type casting happens here
        long a = func();
        System.out.println(a);
        int[] arr = {10, 20, 30};
        print(arr);
        func1(arr);
        print(arr);

        System.out.println(formatNumber(12));
        System.out.println(formatNumber(12.8899876));
        System.out.println(formatNumber("3452345.87576"));

        whichFuncCalled(10L);
        whichFuncCalled(20L);

        System.out.println(isArmstrong(sc.nextInt()));



        /*
        method overloading happens when two or more
        functions have the same name but different parameter
        list (difference either in the number of parameter
        or difference in the type of parameter or both)
        method overloading is not associated with only the return type
        because return type comes later and while calling the function
        only the compiler will not know which function to call if they have
        the same function name and same parameter list but only difference
        in return type

        overloaded methods can have same or different return type but
        method overloading cannot be solely based on the return type only,
        it should have different parameter list.
        */
    }

    private static boolean isArmstrong(int num){
        /*
        Given a number check whether it is Armstrong number or not.
         Armstrong number is a number which satisfies the
         following condition:
         abc = a^n + b^n + c^n where n is the number of digits
         eg: 153 = 1^3 + 5^3 + 3^3
             1634 = 1^4 + 6^4 + 3^4 + 4^4
         */

        //find the number of digits
        int count = countDigits(num);
        return checkIsArmstrong(num, count);
    }

    private static int countDigits(int num){
        int temp = num, count = 0;
        while(temp>0){
            ++count;
            temp/=10;
        }
        return count;
    }

    private static boolean checkIsArmstrong(int num, int count){
        int temp = num, sum = 0;
        while(temp>0){
            sum += Math.pow(temp%10, count);
            temp/=10;
        }
        return sum == num;
    }

    private static void whichFuncCalled(int num){
        System.out.println(num);
    }

    private static void whichFuncCalled(long num){
        System.out.println(num);
    }

    private static String formatNumber(int num){
        return String.format("%d", num);
    }

    private static String formatNumber(double num){
        return String.format("%5.3f", num);
    }

    private static String formatNumber(String num){
        return String.format("%s", num);
    }

    private static void func1(int[] arr){
        arr[0] = 100;
    }

    private static void print(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static int func(){
        int a = 10;
        a = (int) Math.sqrt(a);
        return a;
    }
}
