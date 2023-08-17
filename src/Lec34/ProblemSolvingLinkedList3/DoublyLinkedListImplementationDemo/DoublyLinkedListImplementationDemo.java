package Lec34.ProblemSolvingLinkedList3.DoublyLinkedListImplementationDemo;

public class DoublyLinkedListImplementationDemo {
    public static void main(String[] args) {
        MyDoublyLinkedList dd = new MyDoublyLinkedList();
        System.out.println(dd.isEmpty());
        System.out.println(dd.size());
        System.out.println(dd.getHead());

        dd.print();
        dd.addFirst(10);
        dd.print();
        dd.addFirst(20);
        dd.print();
        dd.addLast(30);
        dd.print();
        dd.addMany(new int[]{1,2,3});
        dd.print(dd.getHead());
        dd.addAt(100 , 2);
        dd.addAt(0, 1000);
        dd.addAt(-2, 30);
        dd.addAt(200, 2);
        dd.addAt(15,1);
        dd.print();
        dd.deleteFirst();
        dd.print();
        dd.deleteLast();
        dd.print();
        dd.deleteAt(7);
        dd.print();
        dd.deleteAt(4);
        dd.print();
        System.out.println(dd.size);
    }
}
