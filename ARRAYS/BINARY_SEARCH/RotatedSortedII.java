package ARRAYS.BINARY_SEARCH;
public class RotatedSortedII {
    /*
    https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
     */
    public boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)return true;
            // the only statement that does not allow to go with prev. sol is::
            if(nums[mid]==nums[start]&&nums[mid]==nums[end])
            {
                //thus if such cond occurs, shrink the array
                start+=1;
                end-=1;
                continue;
            }
            // similar code as search in rotated sorted [ no dupl]
            if(nums[start]<=nums[mid])
            {
                if(target>=nums[start]&&target<nums[mid])end=mid-1;
                else
                    start=mid+1;
            }
            else
            {
                if(target>nums[mid]&&target<=nums[end])start=mid+1;
                else
                    end=mid-1;
            }
        }return false;
    }
}
