package POTD;
public class Maximum_69_number {
    /*
    Ques: https://leetcode.com/problems/maximum-69-number/
     */
    public int maximum69Number (int num) {
        /*
        Approach : the idea is to obtain the highest index of 6 'starting from right to left' and at the end if digit not !=-1
        add the 3*10^(maxDigit) to the original no to make it the maximum no.
         */
        int currdigit=0;
        int highestSix=-1;
        int digit=num;
        while(digit!=0)
        {
            if(digit%10==6)highestSix=currdigit;
            digit/=10;
            currdigit++;
        }return highestSix==-1?num:num+3*(int)Math.pow(10,highestSix);
    }
}
