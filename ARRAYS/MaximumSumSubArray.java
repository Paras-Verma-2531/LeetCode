package ARRAYS;
public class MaximumSumSubArray {
    /*
    Ques:: Given an integer array nums, find the contiguous subarray (containing at least one number)
     which has the largest sum and return its sum.
A subarray is a contiguous part of an array
     */
    /*
    BruteForce approach:: O(N^2)----> TLE
    ---find all the subarrays and check if at any point of time sum>max:: update the max
    at the end return max
    public int maxSubArray(int[] nums) {
        int max=-10001,sum=0;
        if(nums.length==1)return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                max=Math.max(sum,max);
            }
            sum=0;
        }return max;
    }
  */
}
