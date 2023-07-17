package Lec10.Arrays2.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        //declaring ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        //add element in ArrayList
        al.add(1);
        al.add(2);

        // print ArrayList
        System.out.println(al);

        //access
        int a = al.get(0);

        //change
        al.set(0, 10);
        System.out.println(al);

        //remove
        al.remove(1);
        System.out.println(al);

        System.out.println(al.size());
        al.add(20);
        System.out.println(al.size());
        al.remove(1);
        System.out.println(al.size());

        al.add(1, 20);

        for(int i: al){
            System.out.println(i);
        }

        al.set(2, 30);
    }
}
