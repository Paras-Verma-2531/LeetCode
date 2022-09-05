package ARRAYS;
public class Find_Missing_Number {
    /*
    Ques: Given an array nums containing n distinct numbers in the range [0, n],
    return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums
     */
    public int missingNumber(int[] nums) {
        int res=nums.length;// To prevent index out of bound exception
        for(int i=0;i<nums.length;i++)
            res=res^i^nums[i];//since we know a^b^b will give a that is if both index and number of index is present
        // they will cancel each other thus resulting in the missing number
        return res;
    }
}
