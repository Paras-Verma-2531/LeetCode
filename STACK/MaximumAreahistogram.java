package STACK;

import java.util.Stack;

public class MaximumAreahistogram {
    /*
    Ques: find the histogram with maximum area and return its area
    Approach:: find the next smaller and previous smaller element and calculate the area with the formula: ns-ps-1:
  */
    public int[] previousSmaller(int[] arr)
    {
        int[] ans=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i])
                stack.pop();
            ans[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }return ans;
    }
    public int[] nextSmaller(int[] arr)
    {
        int[] ans=new int[arr.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i])
                stack.pop();
            ans[i]=stack.isEmpty()?arr.length:stack.peek();
            stack.push(i);
        }return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int maxsum=0;
        int [] ps=previousSmaller(heights);
        int [] ns=nextSmaller(heights);
        for(int i=0;i<heights.length;i++)
        {
            int cur=(ns[i]-ps[i]-1)*heights[i];// calculates area
            maxsum=Math.max(maxsum,cur);
        }return maxsum;

    }
}
