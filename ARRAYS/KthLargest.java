package ARRAYS;
import java.util.PriorityQueue;
public class KthLargest {
    /*
    Ques:Design a class to find the kth largest element in a stream. Note that it is the kth largest
    element in the sorted order, not the kth distinct element.
Implement KthLargest class:
KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.
     */
    PriorityQueue<Integer>queue;
        private int k;
        public KthLargest(int k, int[] nums) {
            queue=new PriorityQueue<>(k);
            this.k=k;
            for(int n: nums)
                add(n);
        }
        public int add(int val) {
            if(queue.size()<k)
                queue.offer(val);
            else if(queue.peek()<val)
            {
                queue.poll();
                queue.offer(val);
            }return queue.peek();
        }
    }

