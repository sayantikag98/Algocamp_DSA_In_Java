package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;
import java.util.HashSet;

//Ref: https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        //making dummy linked list cyclic
        ll.addMany(new int [] {3,2,0,4});
        Node head = ll.getHead();
        Node temp = head;
        if(temp != null){
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = head;
        }
        System.out.println(hasCycle(head));
        System.out.println(hasCycleOptimized(head));
    }

    private static boolean hasCycleOptimized(Node head){
        /*
        This algo is called Floyd Cycle Finding Algorithm or Floyd Cycle Detection Algorithm
        or Tortoise Hare Algorithm or Slow Fast Pointer Approach
        __________________________________________________________________________________________
        Take two pointers fast and slow, fast pointer is moving at double the speed of the slow pointer
        so by the time slow pointer completes 1 loop the fast pointer will
        complete 2 loops.
        If there is a cycle in the linked list then the fast and the slow pointer
        will eventually meet each other

        fast pointer can move at 3x or 4x or 5x speed as compared to slow pointer instead of 2x
        then also they will meet eventually if there is cycle but the fast one will have
        to complete more loops to reach the slow pointer and the fastest way to do this is to
        make the fast pointer move at 2x speed of slow pointer
         */
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    private static boolean hasCycle(Node head) {
        HashSet<Node> hs = new HashSet<>();
        Node temp = head;
        while(temp != null){
            if(hs.contains(temp)) return true;
            hs.add(temp);
            temp = temp.next;
        }
        return false;
    }


}
