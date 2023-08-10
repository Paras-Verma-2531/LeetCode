package ARRAYS;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    private static boolean binarySearch(int[]a,int element)
    {
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==element)return true;
            if(a[mid]>element)high=mid-1;
            else low=mid+1;
        }return false;
    }
    public static int longestSuccessiveElements(int []a) {
        // Brute force Approach:: O(n^2)
//         Arrays.sort(a);
//        int longest=1;
//        for(int i=0;i<a.length;i++)
//        {
//            int x=a[i];
//            int count=1;
//            while(binarySearch(a, x+1))
//            {
//                count++;
//                x=x+1;
//            }
//            longest=Math.max(longest, count);
//        }return longest;
        //Better Approach : O(nlogn)
        Arrays.sort(a);
        int prevSmallest=Integer.MIN_VALUE;int longest=1,count=0;
        for(int i=0;i<a.length;i++)
        {

            if(a[i]-1==prevSmallest)
            {
                prevSmallest=a[i];
                count++;
            }
            else if(a[i]!=prevSmallest)
            {
                prevSmallest=a[i];
                count=1;
            }
            longest=Math.max(count, longest);
        }return longest;
    }
}
