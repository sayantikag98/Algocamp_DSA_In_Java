package Lec32.ProblemSolvingLinkedList1;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        MyLinkedList ll2 = new MyLinkedList();

        ll1.addMany(new int[]{4,1,8,4,5});
        ll2.addMany(new int[]{5,6,1});

        int intersectionVal = 8;
        Node curr1 = ll1.getHead(), curr2 = ll2.getHead();
        while(curr1!=null && curr1.val != intersectionVal){
            curr1 = curr1.next;
        }
        while(curr2!=null && curr2.next != null){
            curr2 = curr2.next;
        }
        curr2.next = curr1;

        Node temp = getIntersectionNode(ll1.getHead(), ll2.getHead());
        if(temp != null){
            System.out.println(temp.val);
        }
        else{
            System.out.println("null");
        }
    }

    private static Node getIntersectionNode(Node head1, Node head2) {
        int length1 = 0, length2 = 0;
        Node temp1 = head1, temp2 = head2;

        while(temp1 != null){
            length1++;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            length2++;
            temp2 = temp2.next;
        }

        if(length1 != length2){
            int diff = length1>length2 ? length1-length2 : length2-length1;
            while(diff-->0){
                if(length1>length2){
                    head1 = head1.next;
                }
                else{
                    head2 = head2.next;
                }
            }
        }

        temp1 = head1;
        temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}
