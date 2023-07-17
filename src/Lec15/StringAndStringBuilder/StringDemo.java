package Lec15.StringAndStringBuilder;

public class StringDemo {
    public static void main(String[] args) {
        //create string
        //first way to create string
        String name = "Sayantika";
        System.out.println(name);
        //second way to create string
        String surname = new String("Ghosh");
        System.out.println(surname);
        System.out.println(name+" "+surname);

        // to get the total no of characters in the string call length() method
        System.out.println(surname.length());

        // to concatenate first string with the second string and return a new string
        String fullName = name.concat(" ").concat(surname);
        System.out.println(fullName);

        // to compare two strings
        System.out.println(fullName.equals(name+" "+surname));

        // difference between == and equals() method
        // == will compare the two string references
        // whereas equals() method will compare whether the content of the two string are equal or not
        // whether the two string have the same set of characters

        System.out.println("diff between == and equals()");
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str2.equals(str3));

        //Strings are immutable in java
        // Once created they cannot be modified.

        // To get the last character of the string
        System.out.println(str4.charAt(str4.length()-1));

        // To get the substrings
        // first index included, last index excluded if given
        // if last index is not given then substring is given from first index till the end of string
        // throws Index out of bound exception when begin index is negative or begin index larger than end index or end index is larger than the length of the string
        System.out.println(str4.substring(0,2));






    }
}
