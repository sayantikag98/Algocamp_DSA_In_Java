package Lec11.TwoDimensionalArrays;

public class HW_Q4_CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {5,1,0},
                {-5,-5,-5}
        };
        System.out.println(countNegativeInSortedMatrix(arr));
        System.out.println(countNegativeInSortedMatrixUsingLinearSearch(arr));
        System.out.println(countNegativeInSortedMatrixUsingBinarySearch(arr));
    }

    private static int countNegativeInSortedMatrix(int[][] grid) {
        int count = 0, currentColumn = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length - currentColumn; j++){
                if(grid[i][j] < 0){
                    count += (grid.length-i);
                    if(grid[0].length-currentColumn-1-j>0)
                        count += (grid[0].length-currentColumn-1-j) * (grid.length-i);
                    currentColumn = grid[0].length-j;
                }
            }
        }
        return count;
    }

    private static int countNegativeInSortedMatrixUsingLinearSearch(int[][] grid) {
        int count = 0, n = grid.length, currentColumnLastPositive = grid[0].length-1;
        for(int i = 0; i<n; i++){
            while(currentColumnLastPositive>=0 && grid[i][currentColumnLastPositive]<0){
                currentColumnLastPositive--;
            }
            count+=grid[0].length-1-currentColumnLastPositive;
        }
        return count;
    }

    private static int countNegativeInSortedMatrixUsingBinarySearch(int[][] grid) {
        int count = 0, n = grid.length, currentColumnLastPositive = grid[0].length-1;
        for(int i = 0; i<n; i++){
            int low = 0, high = currentColumnLastPositive;
            //for row having all negative numbers then that means all the subsequent rows will have all negative numbers
            //simply add that to count
            if(grid[i][low]<0){
                count+=grid[0].length * (grid.length-i);
                break;
            }
            while(low<high){
                int mid = low+(high-low)/2;
                //if the mid is positive then the last positive will always be either mid or to the right of mid
                //if the last positive is mid then the next element of mid will be negative
                //otherwise last positive will be to the right of mid
                if(grid[i][mid]>=0){
                    //first check whether the mid is the last element or not if it is then mid is already the last positive
                    //if mid is not the last element then check the next element of mid if thats negative then mid is the last postive
                    //otherwise last positive is to the right of mid
                    if((mid+1<grid[0].length && grid[i][mid+1]<0) || mid+1==grid[0].length){
                        low = mid;
                        break;
                    }
                    else low = mid+1;
                }
                //if the mid is negative then the last positive will always be to the left of mid
                else high = mid-1;
            }
            currentColumnLastPositive = low;
            count+=grid[0].length-1-currentColumnLastPositive;
        }
        return count;
    }
}
