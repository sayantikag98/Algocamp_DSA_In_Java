package Lec24.SelectionBubbleAndInsertionSort;
import java.util.Scanner;
import static Lec24.SelectionBubbleAndInsertionSort.BubbleSort.swap;

/*
This problem of finding the kth largest and kth smallest is called kth order statistics
The most efficient algo is quick select algorithm which can solve in O(n)
 */

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {4,1,16,3,2,9};
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        if(k<1 || k>nums.length){
            System.out.println("Please enter a valid k value");
        }
        else{
            kThLargestElement(nums, k);
        }
    }

    private static void kThLargestElement(int[] nums, int k){
        //Each iteration of bubble sort pushes the largest element at the end
        //So run bubble sort k times
        int n = nums.length;
        for(int i = 0; i<k; i++){
            boolean isSwapped = false;
            for(int j = 1; j<n-i; j++){
                if(nums[j-1]>nums[j]){
                    isSwapped = true;
                    swap(nums, j-1, j);
                }
            }
            if(!isSwapped) break;
        }
        System.out.println("The "+k+" largest element is: "+nums[n-k]);
    }
}

/*
TC = O(nk)
SC = O(1)
 */
