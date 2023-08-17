package Lec35.StacksAndQueues;

public class StackImplementationDemo {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.print();
        s.pop();
        s.push(2);
        s.push(4);
        s.print();
        s.pop();
        s.print();
        s.pop();
        s.print();
        s.pop();
        s.print();
    }
}
