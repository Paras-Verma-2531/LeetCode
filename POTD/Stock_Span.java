package POTD;
import java.util.Stack;
public class Stock_Span {
    /*
    Ques: https://leetcode.com/problems/online-stock-span/
    ==========================================
    My Approach:: passed 88/99 test cases
    -----------------------------------
    class StockSpanner {
   Stack<Integer>stack;
   ArrayList<Integer>list;
    public StockSpanner() {
        stack=new Stack<>();
        list=new ArrayList<>();
    }
    public int next(int price) {
        //list.add(price);
        int count=1;
        while(!stack.isEmpty()&&stack.peek()<=price)
        {
            count++;list.add(stack.pop());
        }
        if(list.size()!=0)
        {
            for(int item:list)
            stack.push(item);
        }
        stack.push(price);
        list.clear();
        return count;
    }
}================================================
     */
    /*
    Working Approach:
    ---------------------
    make an stack of array:: which stores current span and price of element i,e each element will store sum of it's smaller number(count)

    =================
    ---------------------
     */
    class StockSpanner {
        Stack <int[]> stack;
        public StockSpanner() {
            stack = new Stack<>();
        }
        public int next(int price) {
            int span = 1;
            while(!stack.isEmpty()&&stack.peek()[0]<=price)
                span += stack.pop()[1];
            stack.push(new int[]{price, span});//push price and current smaller elements into stack
            return span;
        }
    }
}
