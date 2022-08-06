package LINKEDLIST;
public class DeleteNthNodeFromEnd {
    /*
    Ques: delete nth node from the end of the list
    Approach:: run the loop till n+1 and iterate fast;
    then till fast!=null
    iterate fast and slow
    this will bring slow to one node before the node which is to deleted.d:
 */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy= new ListNode(-1,head);
        head=dummy;
        ListNode slow=head,fast=head;int i=0;
        while(i++<n+1)
            fast=fast.next;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }slow.next=slow.next.next;
        return dummy.next;
    }
}
