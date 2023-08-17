package Lec35.StacksAndQueues;

import Lec31.LinkedList.Node;

public class MyStack {

    Node head;
    int size;

    MyStack(){
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public int size(){
        return this.size;
    }

    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int delVal = this.head.val;
        this.head = this.head.next;
        this.size--;
        return delVal;
    }

    public int peek(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return this.head.val;
    }

    public void print(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
