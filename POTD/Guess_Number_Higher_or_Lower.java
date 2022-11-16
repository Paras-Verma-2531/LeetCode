package POTD;
public class Guess_Number_Higher_or_Lower {
    /*
    Ques: https://leetcode.com/problems/guess-number-higher-or-lower/
     */
    public int guess(int n){return 1;}// API method
    public int guessNumber(int n) {
        int start=1,end=n;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(guess(mid)==0)return mid;
            else if(guess(mid)==1)start=mid+1;
            else
                end=mid-1;
        }return start;
    }
}
