package ARRAYS.BINARY_SEARCH;
public class SearchInsertPosition {
    /*
    https://leetcode.com/problems/search-insert-position/
     */
    public int searchInsert(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)return mid;
            if(arr[mid]<target)start=mid+1;
            else end=mid-1;
        }return start;

    }
}
