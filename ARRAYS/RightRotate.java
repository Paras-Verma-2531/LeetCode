package ARRAYS;
public class RightRotate {
    /*
     https://leetcode.com/problems/rotate-array/
       */
    /*brute force approach : O(n^2)
    public void rotate(int[] nums, int k) {
        int actualRotate=k%nums.length;
        while(actualRotate--!=0)
        {
            int temp=nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--)
            {
                nums[i+1]=nums[i];
            }nums[0]=temp;
        }
    } */
    //optimal approach O(n)   O(1)
    private void swap(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {

        int size = nums.length;
        if (size == 1) return;
        k = k % nums.length;
        swap(nums, size - k, size - 1);
        swap(nums, 0, size - k - 1);
        swap(nums, 0, size - 1);
    }
}


