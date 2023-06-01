package ARRAYS;
public class MaximumConsecutiveOnes {
    /*
 https://leetcode.com/problems/max-consecutive-ones/
     */
    /*brute force approach : O(n^2) O(1)
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0,count=0,j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)continue;
            for(j=i;j<nums.length;j++)
            {
                if(nums[j]==0)break;
            }count=j-i;
            maxOnes=Math.max(maxOnes,count);
        }return maxOnes;
    }*/
    //better approach O(n)
    public int findMaxConsecutiveOnes(int[]arr)
    {
        int count=0,maxcount=0;
        for(int i:arr)
        {
            if(i==1)count++;
            else count=0;
            maxcount=Math.max(maxcount,count);
        }return maxcount;
    }

}
