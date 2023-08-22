package Lec33.ProblemSolvingLinkedList2;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

public class HW_Q4_SplitLinkedListInParts {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int []{1,2,3,4,5,6,7});
        Node head = ll.getHead();
        Node[] ans = splitListToParts(head, 8);
        for(Node n: ans){
            if(n != null){
                System.out.print(n.val+" ");
            }
            else{
                System.out.print("null ");
            }
        }
        System.out.println();
    }

    private static Node[] splitListToParts(Node head, int k) {
        if(k == 1) return new Node[]{head};
        Node fast = head;
        int len = 0;

        //length = 5 len = 2, length = 4 len = 2
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            len++;
        }
        len*=2;
        if(fast != null) len++;
        Node[] ans = new Node[k];
        if(k>=len){
            Node temp = head;
            int iter = 0;
            while(temp != null){
                ans[iter++] = temp;
                temp = temp.next;
            }
            while(iter != k){
                ans[iter++] = null;
            }
        }
        else{
           //if all split of equal length is possible or not
           int a = len/k, x = 0, y = 0;
           int iter = 0, counter = 0;
           if(a * k == len){
               Node temp = head;
               while(iter != k){
                   if(counter%a == 0){
                       ans[iter++] = temp;
                   }
                   temp = temp.next;
                   counter++;
               }
           }
           //if split is of unequal length
           else{
                int m = (len+1)/2;
                while(m>0){
                    if(k*m - len>0){
                        if(k - (k*m - len)>0){
                            a = m;
                            y = k*a - len;
                            x = k - y;
                            break;
                        }
                    }
                   m--;
                }
                if(a>0 && x>0 && y>0){
                    int[] index = new int[k];
                    int sum = 0;
                    index[0] = 0;
                    int j = 1;
                    for(int l = 1; l<=x; l++){
                        sum+=a;
                        index[j++] = sum;
                    }
                    for(int l = 1; l<y; l++){
                        sum+=(a-1);
                        index[j++] = sum;
                    }
                    Node temp = head;
                    j = 0;
                    while(iter != k){
                      if(index[j] == counter){
                          ans[iter++] = temp;
                          j++;
                      }
                      temp = temp.next;
                      counter++;
                  }
                }
           }
        }
        Node temp = head;
        int iter = 1;
        while(temp != null){
            if(iter != k && temp.next == ans[iter]){
                temp.next = null;
                temp = ans[iter];
                iter++;
            }
            else temp = temp.next;
        }
        return ans;
    }
}
