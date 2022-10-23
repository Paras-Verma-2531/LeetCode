package ARRAYS;
public class NumberOfStepsToMakeNumberZero {
    /*
    Ques:https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it
     */
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0)
        {
            count++;
            num=num%2==0?num/2:num-1;
        }return count;
    }
    /*
    Using recursion
      static int helper(int n,int count)
    {
        if(n==0)return count;
        return (n&1)==1?helper(n-1,count+1):helper(n/2,count+1);
    }
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
     */
}
