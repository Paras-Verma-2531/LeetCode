package POTD;
public class Remove_Nth_Node_from_End {
    /*
    Ques : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1,head);
        head=dummy;
        ListNode fast=head,slow=head;int i=0;
        while(i++<n+1)
            fast=fast.next;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }slow.next=slow.next.next!=null?slow.next.next:null;
        return head.next;
    }
}
