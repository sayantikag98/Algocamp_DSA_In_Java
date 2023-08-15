package Lec32.ProblemSolvingLinkedList1;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/add-two-numbers/
public class HW_Q1_AddTwoNumbers {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        MyLinkedList ll2 = new MyLinkedList();
        ll1.addMany(new int []{1,2,9,9,9});
        ll2.addMany(new int[]{3,5,4});
        Node temp = addTwoNumbers(ll1.getHead(), ll2.getHead());
        ll1.print(temp);
    }

    private static Node addTwoNumbers(Node head1, Node head2){
//        no reversing needed
        Node p1 = head1, p2 = head2;
        /*
        ansHead is the dummy node created such that this can be placed
        at the start of the answer list
        after the building the answer return next of this dummy node(ansHead)
        /////////////////////////////////////////////////////////////////////
        dummy node concept is important when the head needs to be placed at the start
        and cannot be moved inside the loop
         */
        Node ansHead = new Node(-1), temp = ansHead;
        int carry = 0;

        while(p1!=null || p2!=null){
            int sum = carry;
            if(p1!=null){
                sum+=p1.val;
                p1 = p1.next;
            }
            if(p2!=null) {
                sum+=p2.val;
                p2 = p2.next;
            }
            temp.next = new Node(sum%10);
            temp = temp.next;
            carry = sum/10;
        }

        if(carry>0){
            temp.next = new Node(carry);
        }
        return ansHead.next;
    }

}
