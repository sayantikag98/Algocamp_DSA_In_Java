package Lec32.ProblemSolvingLinkedList1;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        for(int i = 50; i>=50; i-=10){
            ll.addFirst(i);
        }
        Node head = ll.getHead();
        System.out.println(MiddleLinkedList(head).val);
    }

    private static Node MiddleLinkedList(Node head){
        Node slow = head, fast = head;
        /* fast!=null should be before the second condition fast.next!=null
            bcoz if fast is null then fast.next would throw an exception

            && is important bcoz of short circuiting when fast is null condition is false
            and the second condition is not executed and vice-versa
         */

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
