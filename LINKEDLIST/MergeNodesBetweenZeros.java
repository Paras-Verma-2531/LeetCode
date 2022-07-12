package LINKEDLIST;
public class MergeNodesBetweenZeros {
    /*
    Ques::For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes.
    The modified list should not contain any 0's.
    Approach:: O(N)
    initialise a dummy  node and a newhead which points to it.
    run a loop till temp!=null [where temp=head.next]
    if(temp.val!=0)-->do sum
    else
    make newnode of the sum and initialise sum with 0 and set the pointers.
    make temp=temp.next;
    return dummy.next
     */
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode nhead=dummy;
        ListNode temp=head.next;int sum=0;
        while(temp!=null)
        {
            if(temp.val!=0)
                sum+=temp.val;
            else
            {
                ListNode newnode=new ListNode(sum);
                nhead.next=newnode;
                nhead=nhead.next;
                sum=0;
            }temp=temp.next;
        }return dummy.next;
    }
}
