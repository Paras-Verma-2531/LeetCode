package POTD;
import java.util.Collections;
import java.util.PriorityQueue;
/*
Ques: https://leetcode.com/problems/remove-stones-to-minimize-the-total/
 */
public class Remove_Stone_to_minimize_Total {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i: piles)
            pq.offer(i);
        //System.out.println(pq);
        while(k--!=0)
            pq.offer((int)Math.round(pq.poll()/2.0));
        int sum=0;
        while(!pq.isEmpty())sum+=pq.poll();
        return sum;
    }
}
