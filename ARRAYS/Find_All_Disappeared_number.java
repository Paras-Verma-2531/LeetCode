package ARRAYS;
import java.util.ArrayList;
import java.util.List;
public class Find_All_Disappeared_number {
    /*
    Ques: Given an array nums of n integers where nums[i] is in the range [1, n],
    return an array of all the integers in the range [1, n] that do not appear in nums.
    Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
     */
    public static int swap(int[]arr,int i,int j)
    {//A basic swap method to swap values at two indices
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return 0;
    }
    public static void cyclicSort(int[]arr,int size)
    {
        int i=0;
        while(i<size)
        {
            int correct=arr[i]-1;// in an sorted array an element is present at i-1 index
            //therefore find it's actual index
            // if the element at actual index does not match with arr[i] swap them
            int o=(arr[i]!=arr[correct])?swap(arr,i,correct):i++;
        }
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums,nums.length);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)list.add(i+1);
        }return list;
    }
}
