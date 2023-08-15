package Lec32.ProblemSolvingLinkedList1;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;


//Ref: https://leetcode.com/problems/odd-even-linked-list/
public class HW_Q3_OddEvenLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        ll1.addMany(new int[]{1,2,3,4,5});
        Node head = oddEvenLinkedList(ll1.getHead());
        ll1.print(head);
    }

    private static Node oddEvenLinkedList(Node head){
        if(head == null) return head;
        Node p1 = head, p2 = head.next, head1 = head.next;
        while(p1.next != null && p1.next.next != null){
            p1.next = p1.next.next;
            p1 = p1.next;
            p2.next = p2.next.next;
            p2 = p2.next;
        }
        p1.next = head1;
        return head;
    }
}
