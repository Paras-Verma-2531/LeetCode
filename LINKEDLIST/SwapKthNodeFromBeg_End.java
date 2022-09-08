package LINKEDLIST;
public class SwapKthNodeFromBeg_End {
    /*
    Ques:You are given the head of a linked list, and an integer k.
Return the head of the linked list after swapping the values of the kth
node from the beginning and the kth node from the end (the list is 1-indexed).
=====================================================
Approach :: TC --> O(N);
take two pointers one at 1st node to be swap and second at the another node to be  swap
get the first node by running the loop till k-1[make first=first.next]
And second as first.next!=null[basically reach till the the last node [take a node which will start from 0th node and another
from kth node thus when another will be at last node ,the first node would be at kth node from end]
Now, swap the val of the nodes
     */
    public void swap(ListNode first,ListNode second)
    {
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=null,second=null,fast=head,slow=head;
        for(int i=0;i<k-1;i++)
            fast=fast.next;
        first=fast;//save the node(first node that is to be swapped)
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }second=slow;//save the second node;
        swap(first,second);//call the swap method
        return head;
    }
}
