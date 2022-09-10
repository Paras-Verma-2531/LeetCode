package ARRAYS;
public class SetMismatch {
    /*
    Ques:You have a set of integers s, which originally contains all the numbers from 1 to n.
    Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
    which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
============================================
Use CyclicSort
============================================
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
        int[] arr=new int[2];
        cyclicSort(nums,nums.length);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                arr[0]=nums[i];
                arr[1]=i+1;break;
            }
        }return arr;
    }
}
