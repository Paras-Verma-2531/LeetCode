package ARRAYS;
public class MissingPositive {
    /*
    Ques:Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
================================================
Approach : Cyclic Sort::
Since we have to return the first  + missing number we can go for cyclic sort
Avoid the - no's and no> length
else swap them with their correct index
====================
Scan the array the first non-similar index would the element
if not return length+1
     */
    public void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void cyclicSort(int[] arr,int size)
    { int i=0;
        while(i<size)
        {
            int correct=arr[i]-1;
            if(arr[i]>0&&arr[i]<arr.length&&arr[i]!=arr[correct])swap(arr,i,correct);
            else
                i++;
        }
    }
    public int firstMissingPositive(int[] nums) {
        cyclicSort(nums,nums.length);
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=i+1)return i+1;
        return nums.length+1;

    }
}
