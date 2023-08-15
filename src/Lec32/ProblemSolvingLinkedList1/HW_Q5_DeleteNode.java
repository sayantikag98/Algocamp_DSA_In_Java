package Lec32.ProblemSolvingLinkedList1;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/delete-node-in-a-linked-list/
/*
You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given Node node
is not the last node in the linked list.
 */
public class HW_Q5_DeleteNode {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int[]{1,2});
        int deleteVal = 1;
        Node temp = ll.getHead();
        while(temp.val != deleteVal){
            temp = temp.next;
        }
        deleteNode(temp);
        ll.print();
    }

    private static void deleteNode(Node delNode){
        /*
        copy the val of next node in the deleted and delete the next node
        we can delete the next node instead of the current node given, and "pretend" that the node we are given is the next node.
         */
        delNode.val = delNode.next.val;
        delNode.next = delNode.next.next;
    }
}
