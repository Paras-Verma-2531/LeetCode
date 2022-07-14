package QUEUE;
import java.util.ArrayDeque;
import java.util.Queue;
public class MyStack {
    /*
    Ques: Implement Stack with the help of two queues
    Approach: create two queues,till !queue1.isEmpty()-->pop queue1 and add it into queue2
    now add into queue1
    again repeat the first step for queue2
     */
    Queue<Integer> queue1;
    Queue<Integer>queue2;
    public MyStack() {
        queue1=new ArrayDeque<>();
        queue2=new ArrayDeque<>();
    }

    public void push(int x) {
        while(!queue1.isEmpty())
            queue2.offer(queue1.poll());
        queue1.offer(x);
        while(!queue2.isEmpty())
            queue1.offer(queue2.poll());
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
