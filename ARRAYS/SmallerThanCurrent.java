package ARRAYS;
public class SmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newarr=new int[nums.length];int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for (int num : nums) if (num < nums[i]) newarr[i] += 1;
        }return newarr;
    }
}
