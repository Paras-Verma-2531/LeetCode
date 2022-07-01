package ARRAYS;

public class PeakIndex {
    /*
    Ques: find the peak index in the given array:
    Approach:: variation of binary search
    eg:: 1,2,3,4,5,-1,-2,-3,-4 [^]
    peak element would be greater than array[k+1] and array[k-1]
    ::
    if(arr[mid]<arr[mid+1])
    move start to mid + 1
    else move end to mid;
     */
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }
}




