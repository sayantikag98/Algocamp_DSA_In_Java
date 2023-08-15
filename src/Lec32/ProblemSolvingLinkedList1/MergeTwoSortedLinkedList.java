package Lec32.ProblemSolvingLinkedList1;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        MyLinkedList ll2 = new MyLinkedList();
        ll1.addMany(new int[]{1,2,4});
        ll2.addMany(new int[]{1,3,4});
        Node head1 = ll1.getHead();
        Node head2 = ll2.getHead();
//        Node head = mergeTwoSortedList(head1, head2);
//        print(head);
        Node head = mergeTwoSortedListRecursive(head1, head2);
        print(head);
    }

    private static Node mergeTwoSortedList(Node list1 , Node list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        Node p1 = list1, p2 = list2, n = null;
        while(p1 != null && p2 != null){
            if(p1.val<=p2.val){
                n = p1;
                /*
                this while loop will do the following:
                n will be the first node whose val is greater than p2.val
                p1 will be the last node whose val <= p2.val
                 */
                while(n!=null && p2!=null && n.val<=p2.val){
                    p1 = n;
                    n = n.next;
                }
                p1.next = p2;
                p1 = n;

            }
            else{
                n = p2;
                 /*
                this while loop will do the following:
                n will be the first node whose val >= p1.val
                p2 will be the last node whose val < p1.val
                 */
                while(n!=null && p1!=null && n.val<p1.val){
                    p2 = n;
                    n = n.next;
                }
                p2.next = p1;
                p2 = n;
            }
        }
        //whichever head val is smaller is pointing to the merged list
        if(list1.val<=list2.val) return list1;
        return list2;
    }

    private static Node mergeTwoSortedListRecursive(Node list1, Node list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val<=list2.val){
            list1.next = mergeTwoSortedListRecursive(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoSortedListRecursive(list1, list2.next);
            return list2;
        }
    }

    private static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
