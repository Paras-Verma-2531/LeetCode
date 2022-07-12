package LINKEDLIST;
public class MergeNodesBetweenZeros {
    /*
    Ques::For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes.
    The modified list should not contain any 0's.
    Approach:: create dummy node with value -1;
    and start the loop from the head.next till it !=null
    also check till temp.val!=0 and do the sum
    create a newnode with sum value and point it to the dummy.
    return dummy.next
     */
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode newhead=dummy;
        ListNode temp=head.next;
        int sum=0;
        while(temp!=null)
        {
            while(temp.val!=0)
            {
                sum+=temp.val;
                temp=temp.next;
            }
            ListNode newnode=new ListNode(sum);
            newhead.next=newnode;
            newhead=newhead.next;
            temp=temp.next;
            sum=0;
        }return dummy.next;
    }
}
