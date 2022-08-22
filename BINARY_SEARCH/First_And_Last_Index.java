package BINARY_SEARCH;
public class First_And_Last_Index {
    /*
    Ques:: Given an array of integers nums sorted in non-decreasing order,
    find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
     */
    //=====================================================
    //focuses on finding the leftmost index where aa[index]==target
    //[[arr[mid]==target]] should be the last statement:: to prevent TLE
    private int findFirst(int[] arr,int target)
    {
        int start=0,end=arr.length-1;
        int index=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]>=target)end=mid-1;
            if(arr[mid]<target)start=mid+1;
            if(arr[mid]==target)index=mid;
        }return index;
    }
    //focuses on finding the rightmost index where aa[index]==target
    // whenever arr[mid]<=target)make start=mid+1;
    public int findLast(int[] arr,int target)
    {   int start=0,end=arr.length-1;
        int index=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]<=target)start=mid+1;
            if(arr[mid]>target)end=mid-1;
            if(arr[mid]==target)index=mid;
        }return index;
    }
    public int[] searchRange(int[] nums,int target) {
        int[] arr= new int[2];
        arr[0]=findFirst(nums,target);
        arr[1]=findLast(nums,target);
        return arr;
    }
}
