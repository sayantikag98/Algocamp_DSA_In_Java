package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int []{1,2});
        System.out.println(isPalindrome(ll.getHead()));
    }

    private static boolean isPalindrome(Node head){
        if(head == null) return true;
        Node mid = findMid(head);
        Node reverseHead = reverseList(mid);
        while(head != reverseHead && head.next != reverseHead){
            if(head.val != reverseHead.val) return false;
            head = head.next;
            reverseHead = reverseHead.next;
        }
        /*
        writing this check is imp for length = 2 bcoz if total nodes = 2 then
        it does not go inside the while loop
         */
        return head.val == reverseHead.val;
    }

    private static Node findMid(Node head){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static Node reverseList(Node head){
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
