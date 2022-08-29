package BINARY_SEARCH;
public class FindInMountainArray {
    public int peakIndex(int[] arr)//returns the peak Index
    {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])end=mid;
            else start=mid+1;
        }return start;
    }
    public int binarySearch(int start,int end,int target,int[] arr)//order agnostic binarySearch
    { int idx=-1;
        boolean val=arr[start]<arr[end];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)idx=mid;
            if(val)//if ascending order array
            {
                if(arr[mid]>target)end=mid-1;
                else
                    start=mid+1;
            }
            else // descending order array
            {
                if(arr[mid]>target)start=mid+1;
                else
                    end=mid-1;
            }
        }return idx;
    }
    public int findInMountainArray(int target, int[] arr) {
        int end=peakIndex(arr);//peak Index
        //element could be the at the peak Index or on it's either side
        int[] ans=new int[2];//returns the min index among two
        ans[0]=binarySearch(0,end,target,arr);
        ans[1]=binarySearch(end,arr.length-1,target,arr);
        if(ans[0]==-1&&ans[1]==-1)return -1;
        if(ans[0]==-1||ans[1]==-1)return Math.max(ans[0], ans[1]);
        else
            return Math.min(ans[0], ans[1]);
    }
}
