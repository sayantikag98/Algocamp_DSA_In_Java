package Lec32.ProblemSolvingLinkedList1;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/rotate-list/
public class HW_Q4_RotateList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int[]{1,2,3,4,5});
        int k = -2;
        Node head = rotateList(ll.getHead(), k);
        ll.print(head);
    }

    private static Node rotateList(Node head, int k){
        /*
        checking for head == null is imp otherwise when noOfNodes = 0 then
        k%=noOfNodes will throw runtime exception division by zero
         */
        if(head == null) return head;
        int noOfNodes = 0;
        Node temp = head, last = null, prev = null;
        while(temp != null){
            noOfNodes++;
            last = temp;
            temp=temp.next;
        }
        k%=noOfNodes;
        if(k<0) k+=noOfNodes;
        int counter = noOfNodes-k;
        temp = head;
        while(counter-->0){
            prev = temp;
            temp = temp.next;
        }
        last.next = head;
        //checking for null is imp
        if(temp != null) head = temp;
        if(prev != null) prev.next = null;
        return head;
    }

}
