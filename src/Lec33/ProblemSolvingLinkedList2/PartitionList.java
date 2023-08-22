package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/partition-list/
public class PartitionList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int[]{1,4,3,2,5,2});
        Node head = ll.getHead();
        head = partition(head, 3);
        ll.print(head);
    }

    private static Node partition(Node head, int x){
        //if the linked list is empty or has only one node then return head
        if(head == null || head.next == null) return head;

        /*
        ls => pointer pointing the node which marks the start of region less than x
        le => pointer pointing the node which marks the end of region less than x
        ms => pointer pointing the node which marks the start of region equal to or greater than x
        me => pointer pointing the node which marks the end of region equal to or greater than x
        initially all be pointing to null
         */
        Node ls = null, le = null, ms = null, me = null;

        // curr pointer moves along the whole list
        for(Node curr = head; curr != null; curr = curr.next){
            //if curr points to node belonging to less than x region
            if(curr.val<x){
                /*
                condition for marking just the start of the less than x region
                ls will always point to the start of this region
                 */
                if(ls == null){
                    ls = curr;
                    le = ls;
                }
                //gradually expanding this region such that le is always pointing the end of this region
                else{
                   le.next = curr;
                   le = curr;
                }
            }
            //if curr points to node belonging to equal to or greater than x region
            else{
                /*
                condition for marking just the start of equal to or greater than x region
                ms will always point to the start of this region
                 */
                if(ms == null){
                    ms = curr;
                    me = ms;
                }
                //gradually expanding this region such that me is always pointing the end of this region
                else{
                    me.next = curr;
                    me = curr;
                }
            }
        }

        /*
        one thing to remember that if ls is null then le would always be null and if ms is null then me is always null
         */


        /*
        condition for if the list contains only the node equal to or greater than x i.e. ls is null
        then mark me.next as null and return the start of this region
         */
        if(ls == null){
            me.next = null;
            return ms;
        }

        /*
        here there are conditions:
        1. for if all the nodes are less than x and ms = null so check for ms != null when marking me.next as null
        2. for when both the partition regions have some nodes - for this always remember to mark the next of less
        region (A region) as the start of equal to or greater than region (B region) and the end of B region as
        null and return the start of region A
         */
        le.next = ms;
        if(ms != null) me.next = null;
        return ls;
    }
}
