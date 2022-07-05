package LINKEDLIST;

public class deleteMiddleElement {
    /*
    Ques: delete the middle element of the list:
    Approach :: if list has only one node, return null and if two make the head next as null and return;
    else::
    follow the floyd's cycle detection aglo for middle element and make the changes;
     */
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;
        if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.val=slow.next.val;
        slow.next=slow.next.next;
        return head;
    }
}
