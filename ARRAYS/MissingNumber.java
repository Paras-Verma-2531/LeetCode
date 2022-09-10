package ARRAYS;
public class MissingNumber {
    /*
    Ques: Given an array nums containing n distinct numbers in the range [0, n],
    return the only number in the range that is missing from the array.
    =================
    Approach :: Use cyclic sort since range in given[0,n]
    ----
    if array is sorted and has all the elements then the index ==arr[i]
    So do cyclic sort accordingly and if element is missing after sorting return index
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            //if(arr[i]==nums.length)continue;
            if (nums[i] != i && nums[i] != nums.length) swap(nums, nums[i], i);//does not contain duplicate
            else
                i++;
        }
        for (i = 0; i < nums.length; i++)
            if (nums[i] != i) break;
        return i;
    }
    /*
    ----------------------------------
    Another Approach without using cyclic sort
    =================================
    public int missingNumber(int[] nums) {
        int res=nums.length;// To prevent index out of bound exception
        for(int i=0;i<nums.length;i++)
            res=res^i^nums[i];//since we know a^b^b will give a that is if both index and number of index is present
        // they will cancel each other thus resulting in the missing number
        return res;
    }
     */
}
