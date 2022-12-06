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
        int max=-1,min=1001,profit=0;
        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(max, price - min);
        }
        return max;
    }
    /*
    ====================================
     Space used:: O(n) T-->O(N)
     ===================================
     make an array which will store the max for each i th index [length-1....0]
     now find the max using for loop [max=Math.max(max.arr[i]-prices[i]);
     return max;
     ----------------------------------
    public int maxProfit(int[] prices) {
    int[] arr=new int[prices.length];
        int max=prices[prices.length-1];
        for(int i=prices.length-1;i>=0;i--)
           arr[i]=max=Math.max(prices[i],max);// find the max for each index
        max=0;
        for(int i=0;i<prices.length;i++)
           max=Math.max(max,arr[i]-prices[i]);
        return max;
        }
     */
}
