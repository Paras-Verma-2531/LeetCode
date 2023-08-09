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
        // Write your code here.
        Arrays.sort(a);
        int longest=1;
        for(int i=0;i<a.length;i++)
        {
            int x=a[i];
            int count=1;
            while(binarySearch(a, x+1))
            {
                count++;
                x=x+1;
            }
            longest=Math.max(longest, count);
        }return longest;
    }
}
