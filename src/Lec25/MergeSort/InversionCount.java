package Lec25.MergeSort;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr = {5,8,10,11,15,18,2,6,13,14,19};
        System.out.println(inversionCountBruteForce(arr));
        System.out.println(inversionCountMergeSort(arr));
    }

    private static int inversionCountMergeSort(int[] arr){
        return inversionCountMergeSortRecursive(arr, 0, arr.length-1);
    }

    private static int inversionCountMergeSortRecursive(int[] arr, int low, int high){
        if(low == high) return 0;
        int mid = low + (high-low)/2;
        int leftInversionCount = inversionCountMergeSortRecursive(arr, low, mid);
        int rightInversionCount = inversionCountMergeSortRecursive(arr, mid+1, high);
        /*
        total inversion count is the inversion count only in the left half (inversion pair
        where both the elements come from the left half) and the inversion count only in the
        right half (inversion count where both the elements come from the right half) and the
        inversion count obtained from merging the two halves (inversion count where the first
        element of inversion pair ith element come from the first half and the second element
        of the inversion pair that is jth element come from the second half)
        //made MISTAKE here
         */
        return leftInversionCount + rightInversionCount + merge(arr, low, mid, high);
    }

    private static int merge(int[] arr, int low, int mid, int high){
        int count = 0;
        int[] ans = new int [high-low+1];
        int i = low, j = mid+1, k = 0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                ans[k++] = arr[i++];
            }
            else{
                //made MISTAKE here
                count+=mid+1-i;
                ans[k++] = arr[j++];
            }
        }
        while(i<=mid){
            ans[k++] = arr[i++];
        }
        while(j<=high){
            ans[k++] = arr[j++];
        }
        for(k = 0;k<ans.length;k++){
            arr[low+k] = ans[k];
        }
        return count;
    }

    private static int inversionCountBruteForce(int[] arr){
        int n = arr.length, ans = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]>arr[j]) ans++;
            }
        }
        return ans;
    }
}
