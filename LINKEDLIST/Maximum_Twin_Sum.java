package LINKEDLIST;
public class Maximum_Twin_Sum {
    /*
    Ques: Find the maximum sum of twin nodes
    eg: arr[0]and arr[n-1] are the twin nodes
    Approach: since the twin nodes are on the other of list therefore, reverse the list from the middle and start comparison till mid!=null
    and if sum<temp.val+curr.val[update sum]
    return the sum;
     */
    public ListNode middle(ListNode slow,ListNode fast)
    {
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }return slow;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head,nextnode=null,prev=null;
        while(curr!=null)
        {
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }return prev;
    }
    public int pairSum(ListNode head) {
        ListNode mid=middle(head,head);
        ListNode temp=reverse(mid);
        ListNode curr=head;int sum=0;
        while(temp!=null)
        {
            if(sum<(curr.val+temp.val))
                sum=curr.val+temp.val;
            curr=curr.next;
            temp=temp.next;
        }return sum;
    }
}
