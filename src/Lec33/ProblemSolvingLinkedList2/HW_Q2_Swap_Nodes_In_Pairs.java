package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/swap-nodes-in-pairs/
public class HW_Q2_Swap_Nodes_In_Pairs {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int []{});
        Node head = ll.getHead();
        head = swapPairs(head);
        ll.print(head);
    }

    private static Node swapPairs(Node head) {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node prev = dummyNode;
        while(head != null && head.next != null){
            Node next = head.next.next;
            prev.next = head.next;
            head.next.next = head;
            head.next = next;
            prev = head;
            head = next;
        }
        return dummyNode.next;
    }
}
