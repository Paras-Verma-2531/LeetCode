package ARRAYS.BINARY_SEARCH;
import java.util.Arrays;
public class MagneticForceBetweenBalls {
    /*
    https://leetcode.com/problems/magnetic-force-between-two-balls/description/
     */
    public boolean canWePlace(int[]arr,int minDis,int balls)
    {
        //System.out.println("here");
        int count=1,lastIndex=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-lastIndex>=minDis)
            {
                count++;
                lastIndex=arr[i];
            }
            // System.out.println(count);
            if(count>=balls)return true;
        }
        return (count>=balls);
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int ans=1;
        int low=1,high=position[position.length-1]-position[0];
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(canWePlace(position,mid,m))low=mid+1;
            else high=mid-1;
        }return high;
    }
}
