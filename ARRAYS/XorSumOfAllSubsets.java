package ARRAYS;
public class XorSumOfAllSubsets {
    /*
    Ques: The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
Given an array nums, return the sum of all XOR totals for every subset of nums.
Note: Subsets with the same elements should be counted multiple times.
An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b
     */
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    private int helper(int[] nums, int index, int currentXor) {
        // return currentXor when all elements in nums are already considered
        if (index == nums.length) return currentXor;

        // calculate sum of xor with current element
        int withElement = helper(nums, index + 1, currentXor ^ nums[index]);

        // calculate sum of xor without current element
        int withoutElement = helper(nums, index + 1, currentXor);

        // return sum of xors from recursion
        return withElement + withoutElement;
    }
}
