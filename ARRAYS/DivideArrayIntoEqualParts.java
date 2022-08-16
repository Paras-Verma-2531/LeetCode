package ARRAYS;
import java.util.Arrays;
public class DivideArrayIntoEqualParts {
    /*
        Ques:: You are given an integer array nums consisting of 2 * n integers.
You need to divide nums into n pairs such that:
Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false
     */
    public boolean divideArray(int[] nums) {
        int[] newarr=new int[501];// maximum value of n can be 500
        Arrays.fill(newarr,0);
        for(int i=0;i<nums.length;i++)
            newarr[nums[i]]++;//count the frequency of each element
        for(int i: newarr)
            if((i&1)==1)return false;//return false if at any point of time newarr[i]%2!=0(if i is odd)
        return true;
    }
}
