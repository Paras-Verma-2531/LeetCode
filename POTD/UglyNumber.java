package POTD;
public class UglyNumber {
    /*
    Ques: https://leetcode.com/problems/ugly-number/
     */
    public boolean isUgly(int n) {
        if(n<=0)return false;
        while(n>0&&n%5==0)n/=5;
        while(n>0&&n%2==0)n/=2;
        while(n>0&&n%3==0)n/=3;
        return n==1;
    }
}
