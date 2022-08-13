package ARRAYS;
public class MaxProductDifference {
    /*
    Ques:The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y,
 and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
Return the maximum such product difference
     */
    public int maxProductDifference(int[] nums) {
        /*
        Approach 1: using Arrays.sort() method
        Time Comp: O(NlogN)
        :: return the product of length-1*length-2 & nums[0]*nums[1]
        Arrays.sort(nums);
        return nums[nums.length-1]*nums[nums.length-2]-nums[0]*nums[1];

         */
    }
}
