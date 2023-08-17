package Lec35.StacksAndQueues;

public class QueueImplementationDemo {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        q.print();
        q.dequeue();
        System.out.println(q.size());
        q.enqueue(2);
        System.out.println(q.size());
        q.print();
        q.enqueue(4);
        System.out.println(q.size());
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
    }
}
