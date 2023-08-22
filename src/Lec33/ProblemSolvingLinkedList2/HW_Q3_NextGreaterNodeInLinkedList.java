package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/next-greater-node-in-linked-list/
public class HW_Q3_NextGreaterNodeInLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int[] {2,7,4,3,5});
        int[] ans = nextLargerNodes(ll.getHead());
        for(int ele: ans){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    private static int[] nextLargerNodes(Node head) {
        return new int[]{0};
    }
}
