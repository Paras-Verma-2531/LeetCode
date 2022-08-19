package ARRAYS;
public class Trapping_Rain_Water {
    /*
    Ques: Given n non-negative integers representing an elevation map where the width of each bar is 1,
    compute how much water it can trap after raining.
    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
In this case, 6 units of rain water (blue section) are being trapped.
     */
    public int trap(int[] height) {
        int [] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        int maxleft=-1,maxright=-1;
        for(int i=0;i<height.length;i++)
            //leftmax[i] stores max height to the left of index
            leftmax[i]=maxleft=Math.max(maxleft,height[i]);
        for(int i=height.length-1;i>=0;i--)
            //rightmax[i] stores max height to the right of index
            rightmax[i]=maxright=Math.max(maxright,height[i]);
        int sum=0;
        for(int i=0;i<height.length;i++)
            sum+=Math.min(leftmax[i],rightmax[i])-height[i];
        return sum;
    }
}
