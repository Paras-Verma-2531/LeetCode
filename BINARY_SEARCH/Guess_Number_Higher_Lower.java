package BINARY_SEARCH;
class guessGame
{// helper class to return if number is higher or lower or equal
    public int guess(int n){return 1;}
}
/*
Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
//========================================
/*
Ques: We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
You call a pre-defined API int guess(int num), which returns three possible results:
-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
 */
public class Guess_Number_Higher_Lower extends guessGame {
    public int guessNumber(int n) {
        //:::Apply Simple Binary Search for the range(1,n)
        //:::And compare the pick with the mid:: if equal return mid else perform required operations.
        int start=1,end=n;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(guess(mid)==0)return mid;
            else if(guess(mid)==1)start=mid+1;
            else
                end=mid-1;
        }
        return start;
    }
}
