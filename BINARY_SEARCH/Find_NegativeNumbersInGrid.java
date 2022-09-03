package BINARY_SEARCH;
public class Find_NegativeNumbersInGrid {
    /*
    Ques:: Given m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
    return the number of negative numbers in grid.
Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
     */
    public int BinarySearch(int[]arr,int start,int end)
    {//Normal Binary Search
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<0)end=mid;// if ele is <0 make end as mid
                //basic idea is if arr[mid]<0 then arr[mid+1]---length will be <0
            else
                start=mid+1;//else start as mid +1
        }return arr.length-start;
    }
    public int countNegatives(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++)
            sum+=BinarySearch(grid[i],0,grid[i].length);//sum of negative numbers returned by method binarySearch
        return sum;
    }
}
