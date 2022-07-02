package ARRAYS;
/*
Ques::Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
 */
public class Running_Sum_of_1D {
    public int[] runningSum(int[] nums) {
        if(nums.length==1)
            return nums;
        int[] array= new int[nums.length];int sum=0,k=0;
        for(int i: nums)
        {
            array[k++]=sum+=i;//insert sum at array[k]
        }return array;
    }
}
