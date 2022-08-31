package BINARY_SEARCH;
public class SplitArray {
    /*
    Ques::Given an array nums which consists of non-negative integers and an integer m,
     you can split the array into m non-empty continuous subarrays.
Write an algorithm to minimize the largest sum among these m subarrays.
     */
    public int splitArray(int[] nums, int m) {
        int start=0,end=0;
        for(int i: nums)
        {
            start=Math.max(start,i);// max among the each value for if m=no of elements
            end+=i;// total sum for when m=1[only one subArray]
            // thus we have the range now, therefore we can apply binarySearch
        }
        while(start<end)
        {
            int mid=(start+end)/2;
            int sum=0,pieces=1;
            for(int num:nums)// to calculate the sum of subArray
            {
                if(sum+num>mid)// if it surpasses the mid [we have to create another Array]
                {
                    sum=num;pieces++;// means we have another subArray with the initial sum as the no that exceeds the mid
                }else
                    sum+=num;
            }
            if(pieces>m)start=mid+1;
            else end=mid;
        } return start;
    }
}
