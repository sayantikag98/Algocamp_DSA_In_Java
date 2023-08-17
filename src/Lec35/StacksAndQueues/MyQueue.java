package Lec35.StacksAndQueues;

import Lec31.LinkedList.Node;

public class MyQueue {

    Node head;
    Node tail;

    int size;

    MyQueue(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }

    public void enqueue(int val){
        Node newNode = new Node(val);
        if(this.isEmpty()){
            this.head = this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int delVal = head.val;
        this.head = this.head.next;
        this.size--;
        return delVal;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return this.head.val;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
