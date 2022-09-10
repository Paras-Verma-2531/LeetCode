package HEAP;
import java.util.Collections;
import java.util.PriorityQueue;
public class MedianFinder {
    /*
    Ques: The median is the middle value in an ordered integer list.
    If the size of the list is even, there is no middle value and the median is the mean of the two middle values.
For example, for arr = [2,3,4], the median is 3.
For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
============================================================
Basic Approach : Since the median of any array is the mid element of the array therefore,
insert the elements in sorted order and return the arr[mid]or mid+1
the above process will take Order of N^2[N*N-->for sorting]
========================================
Optimized approach:: Since we do not need to to sort the array we only need to find the mid of largest element on the left side
and smallest on right side[[iff there size is equal ,else return the top of right side array]
Assumption:: More numbers will be on right side[maxheap]
1. if maxheap is empty or peek>=num[add into maxheap]
else into minheap
2. if size of maxheap>minheap+1[ add top of maxheap into minheap]--->this is because we are trying to maintain the same size of both the sides
3. if minheap.size()>maxheap)-->add top of minheap into maxheap
================
findMedian()--->Method
---------------------
================
if the size of min and max is equal at any point of time return (maxpeek+minpeek())/2;
else maxpeek
     */
    private PriorityQueue<Integer> maxheap;
    private PriorityQueue<Integer> minheap;
    public MedianFinder() {
        maxheap = new PriorityQueue<>(Collections.reverseOrder());
        minheap = new PriorityQueue<>();
    }
    public void addNum(int num) {
        if (maxheap.isEmpty() || maxheap.peek() >= num) maxheap.offer(num);
        else
            minheap.offer(num);
        if (maxheap.size() > minheap.size() + 1)
            minheap.offer(maxheap.poll());
        else if (maxheap.size() < minheap.size())
            maxheap.offer(minheap.poll());
    }
    public double findMedian() {
        if (maxheap.size() == minheap.size()) return ((maxheap.peek() + minheap.peek()) / 2.0);
        return maxheap.peek();
    }
}


