package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveKthNodeFromEndOfTheList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int[]{1,2,3,4,5});
        int n = 5;
        Node head = ll.getHead();
        head = removeNthNodeFromEndFastAndSlowPointerApproach(head, n);
        ll.print(head);
    }

    private static Node removeNthNodeFromEndFastAndSlowPointerApproach(Node head, int n){
        /*
        create a difference between the fast and slow pointer as n+1 at the start only and then
        move both the pointers at the same speed till the end of the linked list so that
        fast pointer at last points to the last node and the slow pointer is pointing to the node
        previous to the node to be deleted making sure the difference the fast and slow pointer is n+1

        dummy node creation helps in handling the edge case of removing the first node of the linked list
         */
        Node dummyNode = new Node(-1);
        dummyNode.next = head;
        head = dummyNode;
        Node slow = head, fast = head;

        //1 based indexing counter will start from 1 and for 0 based indexing counter will start from 0
        int counter = 1;

        while(counter != n+1){
            fast = fast.next;
            counter++;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head.next;
    }

    private static Node removeNthNodeFromEndAlternateApproach(Node head, int n){
        //1 based indexing followed
        Node slow = head, fast = head;
        int counter = 1;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            counter++;
        }
        int len = 0;

        if(fast == null){
            //even length
            len = (counter-1)*2;
        }
        else if(fast.next == null){
            //odd length
            len = (counter-1)*2+1;
        }
        if(len == n){
            head = head.next;
        }
        else{
            n=len-n;
            if(counter != n){
                if(counter>n){
                   slow = head;
                   counter = 1;
                }
                while(counter != n){
                    slow = slow.next;
                    counter++;
                }
            }
            slow.next = slow.next.next;
        }
        return head;
    }

    private static Node removeNthNodeFromEnd(Node head, int n){
        int counter = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            counter++;
        }
        n = counter - n + 1;
        Node dummyNode = new Node(-1);
        dummyNode.next = head;
        head = dummyNode;
        temp = head;
        counter = 1;
        while(counter != n){
            temp = temp.next;
            counter++;
        }
        temp.next = temp.next.next;
        return head.next;
    }
}
