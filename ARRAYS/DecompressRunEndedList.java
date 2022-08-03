package ARRAYS;
import java.util.Arrays;
public class DecompressRunEndedList {
    /*
    Ques:: We are given a list nums of integers representing a list compressed with run-length encoding.
Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
For each such pair, there are freq elements with value val concatenated in a sublist.
Concatenate all the sublists from left to right to generate the decompressed list.
Return the decompressed lis
     */
    public int[] decompressRLElist(int[] nums) {
        int arrsize=0;
        for(int i=0;i<nums.length;i+=2)
        {
            arrsize+=nums[i];//calculate the size of the array
        }
        int[] newarr=new int[arrsize];int j=0;
        for(int i=0;i<nums.length;i+=2)
        {
            Arrays.fill(newarr,j,j+nums[i],nums[i+1]);//final pos=j+nums[i]
            // otherwise it may result to lesser index [we want 4 it may result less]
            j+=nums[i];
        }return newarr;
    }
}
