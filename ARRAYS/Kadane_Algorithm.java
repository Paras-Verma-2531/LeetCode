package ARRAYS;
public class Kadane_Algorithm {
    /*
    Quess: Given an array Arr[] of N integers.
    Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
     */
    long maxSubarraySum(int arr[], int n){
        //Time Comp: O(N) || space comp: O(1)
        int max=-10000001,sum=0;
        for(int i: arr)
        {
            sum+=i;// make contiguous sum
            max=Math.max(sum,max);// find the max
            if(sum<0)sum=0;// if sum is < 0 :: neglect the subarray
        }
        return max;
    }
}
