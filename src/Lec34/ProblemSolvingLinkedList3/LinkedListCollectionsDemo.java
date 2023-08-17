package Lec34.ProblemSolvingLinkedList3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollectionsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addAll(new ArrayList<>(Arrays.asList(1,2,3)));
        System.out.println(ll);

        List<Integer> l = Arrays.asList(1,2,3,4,5);
        System.out.println(l);

        System.out.println(ll.get(0));
        ll.add(1,100);
        System.out.println(ll);
        ll.set(1, 300);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);

    }
}
