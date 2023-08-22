package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
public class HW_Q5_MaximumTwinSumOfLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int [] {5,4,2,1});
        System.out.println(maximumTwinSum(ll.getHead()));
    }

    private static int maximumTwinSum(Node head){
        /*
        Approach:
        1. find mid -> slow and fast pointer
        2. reverse the later half
        3. run two pointer one from head and another from reverse list head and
        run this till mid and get the max sum along the way
         */
        Node mid = findMid(head);
        Node revHead = reverse(mid);
        Node p1 = head, p2 = revHead;
        int maxSum = -1;
        while(p1!=mid){
            maxSum = Math.max(maxSum, p1.val + p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        return maxSum;
    }

    private static Node findMid(Node head){
        Node slow = head, fast = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node reverse(Node head){
        Node prev = null;
        while(head != null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
