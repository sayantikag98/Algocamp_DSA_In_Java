package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
public class HW_Q6_DeleteTheMiddleNodeOfTheLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int []{1,2,3,4,5});
        Node head = ll.getHead();
        head = deleteMiddle(head);
        ll.print(head);
    }

    private static Node deleteMiddle(Node head) {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        head = dummyNode;
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head.next;
    }
}
