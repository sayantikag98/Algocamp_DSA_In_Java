package Lec32.ProblemSolvingLinkedList1;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;


//Ref: https://leetcode.com/problems/reverse-linked-list/
public class ReverseALinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        for(int i = 50; i>=20; i-=10){
            ll.addFirst(i);
        }
        Node head = ll.getHead();
        System.out.println("Before reversing");
        ll.print(head);
        System.out.println("After reversing");
        head = reverseLinkedList(head);
        ll.print(head);
        head = reverseLinkedListRecursive(head);
        ll.print(head);

    }

    private static Node reverseLinkedList(Node head){
        if(head == null || head.next == null) return head;
        Node temp = head.next, temp1 = head.next.next;
        head.next = null;
        while(temp != null){
            temp.next = head;
            head = temp;
            temp = temp1;
            if(temp1 != null) temp1 = temp1.next;
        }
        return head;
    }

    private static Node reverseLinkedListRecursive(Node head){
        if(head == null || head.next == null) return head;
        Node prev = reverseLinkedListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
    }



}
