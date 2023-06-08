package ARRAYS;

public class FirstAndLastOccurence {
    /*
    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    brute force approach: O(2N)
    do linear search twice:
    for the first time do from the starting index
    for the second time do it from the end
    public int[] searchRange(int[] nums, int target) {
        int[]arr=new int[2];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==target)
           { arr[0]=i;
            break;
           }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
           {
               arr[1]=i;
               break;
           }
        }return arr;
    }
     */
    //optimal approach : Binary search O(logn)
    public int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int[]arr=new int[2];
        Arrays.fill(arr,-1);
        //for the first index
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                arr[0]=mid;
                end=mid-1;
            }
            else if(nums[mid]<target)start=mid+1;
            else  end=mid-1;
        }
        //for the last index
        start=0;end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                arr[1]=mid;
                start=mid+1;
            }
            else if(nums[mid]>target)end=mid-1;
            else start=mid+1;

        }return arr;
    }
}
