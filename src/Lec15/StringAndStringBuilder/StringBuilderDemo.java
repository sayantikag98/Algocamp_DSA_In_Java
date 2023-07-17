package Lec15.StringAndStringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "Hello";
        // String to StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.insert(0, "abc");
        System.out.println(sb);
        sb.insert(sb.length(), "abc");
        System.out.println(sb);
        sb.setCharAt(0, 'A');
        System.out.println(sb);

        //StringBuilder to String
        System.out.println(sb.toString());
    }
}
