package ARRAYS;
public class RichestCustomerWealth {
    /*
    Ques:: You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
      customer has in the bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
 The richest customer is the customer that has the maximum wealth.
     */
    public int maxWealth(int[] arr)
    {
        int sum=0;
        for(int i: arr)
            sum+=i;
        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++)
            max=Math.max(max,maxWealth(accounts[i]));
        return max;
    }
}
