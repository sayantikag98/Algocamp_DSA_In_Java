package Lec32.ProblemSolvingLinkedList1;

import java.util.HashMap;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
public class HW_Q2_RemoveZeroSumConsecutiveNodeFromLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int []{3,2,-2,-3,100,5,-5,1});
        Node head = ll.getHead();
//        head = removeZeroSum(head);
        head = removeZeroSumUsingPrefixSumAndHashMap(head);
        ll.print(head);
    }

    private static Node removeZeroSumUsingPrefixSumAndHashMap(Node head){
        //TC => O(n), SC = O(n)
        //No need to make a prefix array
        HashMap<Integer, Node> hm = new HashMap<>();
        int prefix = 0;
        /*
        Creating a dummy node is imp bcoz if the consecutive sequence
        whose sum is zero starts from head then for removing that
        dummy node is required
         */
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        for(Node temp = dummyNode; temp!=null; temp = temp.next){
            prefix+=temp.val;
            /*
            If the key in the hashmap is already present then it replaces
            the old value with the new value
             */
            hm.put(prefix, temp);
        }
        //set it to zero imp (made a mistake here)
        prefix = 0;
        for(Node temp = dummyNode; temp!=null; temp = temp.next){
            prefix+=temp.val;
            temp.next = hm.get(prefix).next;
        }
        return dummyNode.next;
    }

    private static Node removeZeroSum(Node head){
        //TC => O(n^2), SC => O(1)
       Node temp = head, prev = null;
       while(temp != null){
           Node temp1 = temp;
           int sum = 0;
           while(temp1 != null){
               sum+=temp1.val;
               temp1 = temp1.next;
               if(sum == 0){
                   if(prev==null){
                       head = temp1;
                       temp = head;
                   }
                   else{
                       prev.next = temp1;
                   }
               }
           }
           prev = temp;
           /*
           if linked list becomes empty after deleting then temp is null
           so this check is imp
            */
           if(temp!=null) temp = temp.next;
       }
        return head;
    }
}
