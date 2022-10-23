package POTD;
public class SetMismatch {
    /*
    Ques: https://leetcode.com/problems/set-mismatch/
     */
    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void cyclicSort(int[]arr,int size)
    { int i=0;
        while(i<size)
        {
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i])swap(arr,i,correct);
            else
                i++;
        }
    }
    public int[] findErrorNums(int[] nums) {
        cyclicSort(nums,nums.length);
        for(int i=0;i<nums.length;i++)
        {
            int correctIndex=nums[i]-1;
            if(nums[correctIndex]!=i+1)
            {
                return new int[]{nums[i],i+1};
            }
        }return new int[]{-1,-1};
    }
}
