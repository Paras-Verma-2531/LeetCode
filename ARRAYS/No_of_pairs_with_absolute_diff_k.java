package ARRAYS;
/*
Ques::Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
Approach: two loops and check if |arr[j]-array[i]| ==k make count++
 */
public class No_of_pairs_with_absolute_diff_k {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])==k)
                    count++;
            }
        }return count;

    }
}
