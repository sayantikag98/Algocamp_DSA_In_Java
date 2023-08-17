package Lec35.StacksAndQueues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionsDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(10);
        q.remove(10);
        System.out.println(q.peek());

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(10);
        q1.add(20);
        q1.remove(10);
        System.out.println(q1.peek());

    }
}
