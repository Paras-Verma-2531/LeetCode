package ARRAYS;
public class SmallerThanCurrent {
    /*
    Ques : Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newarr=new int[nums.length];int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for (int num : nums) if (num < nums[i]) newarr[i] += 1;
        }return newarr;
    }
}
