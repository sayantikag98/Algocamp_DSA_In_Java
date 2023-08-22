package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedListCycleStart {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int [] {3,2,0,4});
        Node head = ll.getHead();
        Node temp = head;
        if(temp != null){
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = head;
        }
        Node ans = startOfCycle(head);
        if(ans != null) System.out.println(ans.val);
    }

    private static Node startOfCycle(Node head){
        /*
        The distance (no of nodes present) between the head and the start of the cycle
        and the distance between the meeting point and the start of the cycle are the same
        so if we keep two pointers one at the head and another one at the meeting point and
        start moving the two pointers at the same speed they will both reach the start of the
        cycle at the same time.
         */
        Node fast = head, slow = head;
        boolean isCyclePresent = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                isCyclePresent = true;
                break;
            }
        }
        if(isCyclePresent){
            while(fast != slow){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
