package ARRAYS;
public class RotatedAndSorted_Array {
    /*
    Ques:: There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target,
return the index of target if it is in nums, or -1 if it is not in nums.
     */
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)return mid;
            if(nums[start]<=nums[mid])// if left part is sorted
            {
                if(target>=nums[start]&&target<nums[mid])end=mid-1;// if element in present in the range
                else
                    start=mid+1;
            }
            else// right part is sorted
            {
                if(target>nums[mid]&&target<=nums[end])start=mid+1;
                else
                    end=mid-1;
            }
        }return -1;
    }
}
