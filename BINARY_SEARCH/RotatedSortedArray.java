package BINARY_SEARCH;
public class RotatedSortedArray {
    /*
    Ques:: There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
     */
    //=================================================================
    //modified pivot method for rotated sorted Array
    public int pivot(int[]arr)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            //case 1: when arr[mid]>arr[mid+1] {only possible decreasing order in array} when mid is the pivot
            //[4,5,6,7,8,1,2,3] {8,1}
            if(mid<end&&arr[mid]>arr[mid+1])return mid;//mid+1 might through IOB therefore check mid<end
            if(mid>start&&arr[mid]<arr[mid-1])return mid-1;// vice versa of first case:
            if(arr[start]>=arr[mid])end=mid-1;// if we are in increasing order array
            else
                start=mid+1;// for decreasing order
        }return -1;
    }
    public int binarySearch(int[]arr,int start,int end,int target)
    {//Normal binary Search
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)return mid;
            if(arr[mid]>target)end=mid-1;
            else
                start=mid+1;
        }return -1;
    }
    public int search(int[] nums, int target) {
        int pos= pivot(nums);
        int start=0,end=nums.length-1;
        if(pos!=-1)// means array is rotated &  sorted
        {
            if(nums[pos]==target)return pos;
            if(target>=nums[start])end=pos-1;//resides in left portion
            else start=pos+1;//resides in right portion
        }return binarySearch(nums,start,end,target);
    }
}
