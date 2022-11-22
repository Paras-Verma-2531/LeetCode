package POTD;
public class LeastPerfectSquares {
    /*
    Ques:https://leetcode.com/problems/perfect-squares/
     */
    public int numSquares(int n)
    {
        //using DP method
        // tabulation approach:
        int[]tabu=new int[n+1];
        tabu[0]=0;
        for(int i=1;i<=n;i++)
        {
            tabu[i]=i;
            for(int j=1;j*j<=i;j++)
            {
                int square=j*j;
                tabu[i]=Math.min(tabu[i],1+tabu[i-square]);
            }
        }return tabu[n];
    }
}
