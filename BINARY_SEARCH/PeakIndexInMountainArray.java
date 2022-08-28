package BINARY_SEARCH;
public class PeakIndexInMountainArray {
    /*
    Ques:An array arr a mountain if the following properties hold:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... >
arr[arr.length - 1].
You must solve it in O(log(arr.length)) time complexity.
     */
    //Approach : BinarySearch ----Tc:--> O(Log(n))
    public int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            // if less :: make start as mid+1[mid+1]becoz till arr[start]--arr[mid] we cannot have a               peak element:
            if(arr[mid]<arr[mid+1])start=mid+1;
            else
                end=mid;
        }return start;
    }
}
