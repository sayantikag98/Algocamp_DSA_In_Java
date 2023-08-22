package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/reverse-nodes-in-k-group/

public class ReverseNodesInKGroups {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int[] {1,2});
        Node head = ll.getHead();
        int k = 2;
//        head = reverseNodeInKGroups(head, k);
        head = reverseNodeInKGroupAlternate(head, k);
        ll.print(head);
    }

    private static Node reverseNodeInKGroupAlternate(Node head, int k){
        Node dummyNode = new Node(-1);
        dummyNode.next = head;
        reverseNodeInKGroupRecursive2(head, dummyNode, 0, k);
        return dummyNode.next;
    }



    private static void reverseNodeInKGroupRecursive1(Node head, Node prev, int counter, int k){
        if(head == null){
            if(counter == k) reverseList(prev, head);
            return;
        }
        if(counter == k){
            prev = reverseList(prev, head);
            reverseNodeInKGroupRecursive1(head.next, prev, 1, k);
        }
        else reverseNodeInKGroupRecursive1(head.next, prev, counter+1, k);

        //O(n) recursive calls, SC = O(n), TC = O(k*n/k)
    }

    private static void reverseNodeInKGroupRecursive2(Node head, Node prev, int counter, int k){
        if(head == null){
            if(counter == k) reverseList(prev, head);
            return;
        }
        while(head != null && counter != k){
            head = head.next;
            counter++;
        }
        if(counter == k){
            prev = reverseList(prev, head);
            if(head != null) reverseNodeInKGroupRecursive2(head.next, prev, 1, k);
        }

        //O(n/k) recursive calls, SC = O(n/k), TC = O(k*n/k)
    }

    private static Node reverseNodeInKGroups(Node head, int k){
        Node dummyNode = new Node(-1);
        dummyNode.next = head;
        head = dummyNode;
        Node prev = dummyNode;
        Node temp = head.next;
        int counter = 0;
        while(temp != null){
            if(counter == k){
                prev = reverseList(prev, temp);
                counter = 0;
            }
            counter++;
            temp = temp.next;
        }


        /*
        when counter is equal to k and the temp has reached the end of the linked list
        then the last reversal should happen
        this is important otherwise this test case 1->2->X for k=2 will fail and give the output
        1->2->X instead of correct answer 2->1->X
        Made MISTAKE here
         */
        if(counter == k){
            reverseList(prev, temp);
        }


        return head.next;
    }

    private static Node reverseList(Node prev, Node end){
        //prev is the node previous to the start of the reverse list
        //end is the node next to the end of the reverse list
        Node head = prev.next, temp = prev, ans = head;
        prev = end;
        while(head != end){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        temp.next = prev;
        //returning the start of the reverse list is imp bcoz this is going to be the next prev node
        return ans;
    }
}
