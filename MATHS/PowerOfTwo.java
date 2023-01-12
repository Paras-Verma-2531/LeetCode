package MATHS;
public class PowerOfTwo {
    /*
    Ques:https://leetcode.com/problems/power-of-two/
     */
    public boolean isPowerOfTwo(int n) {
        if(n==1)return true;//if at any time no is 1: return true; becoz 2^0==1
        if(n%2!=0||n==0)return false;//return false if either no id odd or no is 0
        return isPowerOfTwo(n/2);
    }
}
