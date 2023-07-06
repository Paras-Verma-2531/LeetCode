package ARRAYS.BINARY_SEARCH;
public class KthMissingPosNumber {
    /*
    https://leetcode.com/problems/kth-missing-positive-number/
    Brute force Approach : O(N) if arr[i]<k make k++ else return k;
     Better Approach: O(logn) find no of missing no at each index and do BS on that
    */
    public int findKthPositive(int[] arr, int k) {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int missingNumAtIndex=arr[mid]-(mid+1);
            if(k<=missingNumAtIndex)high=mid-1;
            else low=mid+1;
        }return high+k+1;
    }
}
