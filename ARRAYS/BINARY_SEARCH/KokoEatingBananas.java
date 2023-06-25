package ARRAYS.BINARY_SEARCH;

public class KokoEatingBananas {
    /*
     https://leetcode.com/problems/koko-eating-bananas/description/
     */
    private int requireTime(int []piles,int hourly)
    {
        int totalHour=0;
        for(int i:piles)
        {
            totalHour+=Math.ceil(i/(double)hourly);
        }return totalHour;
    }
    // brute force approach : O(max_n*N)
    // since the max no of bananas kuko can eat per hour is max[piles] :: therefore from 1-->max check for the smallest integer
    // which satisfies the cond:
    /*
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int totalHours=0;
        for(int i=0;i<piles.length;i++)
            max=Math.max(max,piles[i]);
        for(int i=1;i<=max;i++)
        {
            totalHours=requireTime(piles,i);
            if(totalHours<=h)return i;
        }return 1;
    }*/
    //optimal approach: O(logn*N)
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int totalHours=0;
        for(int i=0;i<piles.length;i++)
            max=Math.max(max,piles[i]);
        int low=1,high=max;//applied BS on answers :: since least speed=1, and max could be max no of banana:[low<=ans<=max]
        while(low<=high)
        {
            int mid=(low+high)/2;
            totalHours=requireTime(piles,mid);
            if(totalHours<=h)high=mid-1;
            else low=mid+1;
        }return low;
    }
    public static void main(String[] args) {
        System.out.println(new KokoEatingBananas().minEatingSpeed(new int[]{3,6,7,11},8));
    }
}
