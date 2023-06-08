package ARRAYS.BINARY_SEARCH;
public class FindMin {
    /*
    https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions
     */
    // brute force approach : O(N) linear search::
    //optimal approach : 0(logn) binary search
    public int findMin(int[] nums) {
        int min=5001;
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[start]<=nums[mid])
            {
                min=Math.min(min,nums[start]);
                start=mid+1;
            }
            else
            {
                min=Math.min(min,nums[mid]);
                end=mid-1;
            }
        }return min;
    }
}
