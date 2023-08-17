package Lec34.ProblemSolvingLinkedList3;

import Lec31.LinkedList.MyLinkedList;
import Lec31.LinkedList.Node;

//Ref: https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/
public class MinimumAndMaximumNumberOfNodesBetweenCriticalPoints {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addMany(new int []{5,3,1,2,5,1,2});
        int[] ans = nodesBetweenCriticalPoints(ll.getHead());
        System.out.println(ans[0]+" "+ans[1]);
    }

    private static int[] nodesBetweenCriticalPoints(Node head) {
        int[] ans = {-1, -1};  // ans[0] - minimum distance & ans[1] - maximum distance
        //always starts from the second node bcoz critical points does not exist at the extremes (head and last node)
        Node p1 = head.next;
        /*
        keep account of previous value (prev),
        first critical point index (firstCriticalPt) for keeping track of maximum distance and minimum distance if 2 critical points are there
        last visited critical point index (lastVisitedCriticalPt) for keeping track of minimum distance

        // if there are two nodes then there is no critical point ans = [-1, -1]
        // if there is only one critical point then ans = [-1, -1]
        // if there are more than 2 critical points then maximum distance would be the distance
        between last critical point (lastVisitedCriticalPt) and the first critical point (firstCriticalPt)
        and minimum distance would be the minimum value of minimum distance till now (ans[0]) and
        the distance between the current critical point (index) and the
        last visited critical point (lastVisitedCriticalPt)

        This works because the maximum distance would always be computed from the critical points located
        at the extreme ends and the minimum distance would always be computed from the minimum across all the
        distances between consecutive critical points
         */

        int prev = head.val, index = 1, firstCriticalPt = -1, lastVisitedCriticalPt = -1;

        // move till the last node
        while(p1.next != null){
            index++; // 1 based current index

            // local maxima or local minima for critical point
            if((p1.val>prev && p1.val>p1.next.val) || (p1.val<prev && p1.val<p1.next.val)){

                // to start computing the maximum and the minimum distance from the second critical point
                if(firstCriticalPt != -1 && lastVisitedCriticalPt != -1){

                    /*
                        In case of second critical point the maximum and the minimum distance is same and
                        for other critical points it is minimum of minimum till now (ans[0]) and the
                        distance between current index and the last visited node
                     */
                    ans[0] = ans[0] != -1 ? Math.min(ans[0], index - lastVisitedCriticalPt) : index - lastVisitedCriticalPt;
                }

                // first critical point index would be computed only at the first time
                if(firstCriticalPt == -1){
                    firstCriticalPt = index;
                }
                lastVisitedCriticalPt = index;
            }

            prev = p1.val;
            p1 = p1.next;
        }

        // maximum distance is the distance between last critical point and the first critical point
        if(firstCriticalPt != lastVisitedCriticalPt){
            ans[1] = lastVisitedCriticalPt - firstCriticalPt;
        }

        return ans;
    }
}
