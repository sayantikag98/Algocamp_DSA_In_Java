package Lec10.Arrays2.ArrayList;
import java.util.ArrayList;

public class ArrayListRevise {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Javascript");
        al.add("Java");
        al.add("cpp");
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(1));
        al.set(1, "swift");
        System.out.println(al.get(1));
        System.out.println(al);
        al.add(0, "Java");
        System.out.println(al);
        al.remove("swift");
        System.out.println(al);
    }
}
