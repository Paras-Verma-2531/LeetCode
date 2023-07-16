package QUEUE;
import java.util.Queue;
import java.util.Stack;
public class ReverseQueue {
    /*
    https://practice.geeksforgeeks.org/problems/queue-reversal/
     */
    public Queue <Integer> rev(Queue<Integer> q){
        if(q.size()==1)return q;
        Stack <Integer> stack=new Stack<>();
        while(!q.isEmpty())
        {
            stack.push(q.poll());
        }
        while(!stack.isEmpty())q.offer(stack.pop());
        return q;
    }
}
