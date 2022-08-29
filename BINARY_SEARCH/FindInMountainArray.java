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
        int firstIdx=binarySearch(0,end,target,arr);
        if(firstIdx!=-1)return firstIdx;
        int secondInd=binarySearch(end,arr.length-1,target,arr);
       return secondInd==-1?-1:Math.max(firstIdx,secondInd);
    }
}
