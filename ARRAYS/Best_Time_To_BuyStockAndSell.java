package ARRAYS;
public class Best_Time_To_BuyStockAndSell {
    /*
    Ques:: You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction
. If you cannot achieve any profit, return 0
     */
    public int maxProfit(int[] prices) {
        /*
        Optimised Approach :: T-->O(N),space comp: O(1)
        Approach : find the min time and with each a[i] find it's profit::
        and make the max as Max(max,profit);
        return max;

         */
        int max=0,min=prices[0],profit=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min,prices[i]);
            profit=prices[i]-min;
            max=Math.max(max,profit);
        }return max;
    }
}
