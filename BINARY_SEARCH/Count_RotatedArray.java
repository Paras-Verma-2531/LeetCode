package BINARY_SEARCH;
public class Count_RotatedArray {
    /*
    Ques: Given an ascending sorted rotated array Arr of distinct integers of size N.
     The array is right rotated K times. Find the value of K.
     */
    //Approach :: return the pivot index +1 :: that will be the answer becoz in sorted Array pivot would be at last, and if it is rotated it woul be at some index
    // which tells how many times a array is rotated
    int findKRotation(int arr[], int n) {
        int start=0,end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1])return mid+1;
            if(mid>start&&arr[mid]<arr[mid-1])return (mid-1)+1;
            if(arr[start]<=arr[mid])start=mid+1;
            else
                end=mid-1;
        }return 0;
    }
}
