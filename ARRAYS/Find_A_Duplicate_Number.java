package ARRAYS;
public class Find_A_Duplicate_Number {
    /*
    Ques:Given an array of integers nums containing n + 1
    integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.
===================================
Approach :: Use Cyclic Sort since range of a number is given
     */
    public static int swap(int[]arr,int i,int j)
    {
        arr[i]^=arr[j];
        arr[j]^=arr[i];
        arr[i]^=arr[j];
        return 0;
    }
    public static void cyclicSort(int[] arr,int size)
    {
        int i=0,o=0;
        while(i<size)
            //in an sorted array an element is present at i-1 index
            //therefore find it's actual index
            // if the element at actual index does not match with arr[i] swap them
            o=(arr[i]!=arr[arr[i]-1])?swap(arr,i,arr[i]-1):i++;
    }
    public int findDuplicate(int[] nums) {
        cyclicSort(nums,nums.length);
        int i=0;
        for(;i<nums.length;i++)
        {
            if(nums[i]!=i+1)break;
        }return nums[i];
    }
}
