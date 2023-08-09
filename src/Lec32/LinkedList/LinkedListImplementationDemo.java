package Lec32.LinkedList;

public class LinkedListImplementationDemo {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        System.out.println(ll.size());
        System.out.println(ll.isEmpty());
        ll.print();
        System.out.println("_____");
        ll.addFirst(10);
        ll.print();
        System.out.println("_____");
        ll.addFirst(20);
        ll.print();
        System.out.println("_____");
        ll.addLast(30);
        ll.print();
        System.out.println("_____");
        ll.addLast(40);
        ll.print();
        System.out.println("_____");
        ll.addAt(10, 0);
        ll.print();
        System.out.println("_____");
        ll.addAt(20, 1);
        ll.print();
        System.out.println("_____");
        ll.addAt(50, 2);
        ll.print();
        System.out.println("_____");
        ll.addAt(50, -1);
        ll.print();
        System.out.println("_____");
        ll.deleteLast();
        ll.print();
        System.out.println("_____");
        ll.deleteFirst();
        ll.print();
        System.out.println("_____");
        ll.deleteAt(0);
        ll.print();
        System.out.println("_____");
        ll.deleteAt(2);
        ll.print();
        System.out.println("_____");
        ll.deleteAt(1);
        ll.print();
        System.out.println("_____");
    }
}
