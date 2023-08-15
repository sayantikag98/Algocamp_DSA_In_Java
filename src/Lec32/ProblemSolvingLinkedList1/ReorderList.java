package Lec32.ProblemSolvingLinkedList1;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;


//Ref: https://leetcode.com/problems/reorder-list/
public class ReorderList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int[]{1,2,3,4});
        Node head = ll.getHead();
        ll.print(head);
        head = reorderList(head);
        ll.print(head);
    }

    private static Node reorderList(Node head){
        if(head==null || head.next == null) return head;
        Node mid = findMid(head);
        Node head1 = mid.next;
        mid.next = null;
        head1 = reverseList(head1);
        Node p1 = head, p2 = head1, prev = head;
        while(p1!=null && p2!=null){
            p1 = p1.next;
            prev.next = p2;
            prev = prev.next;
            p2 = p2.next;
            prev.next = p1;
            prev = prev.next;
        }
        return head;
    }

    private static Node findMid(Node head){
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static Node reverseList(Node head){
        Node prev = null;
        while(head!=null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
