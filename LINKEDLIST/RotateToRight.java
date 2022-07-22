package LINKEDLIST;
public class RotateToRight {
    /*
    Ques: Given the head of a linked list, rotate the list to the right by k places.
     */
    public ListNode insertAtHead(ListNode head)
    {
        ListNode newhead=null;
        ListNode curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        newhead=curr.next;
        curr.next=null;
        newhead.next=head;
        return newhead;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)
            return head;
        ListNode temp=head;int len=0;
        while(temp!=null)// calculate length
        {
            len++;temp=temp.next;
        }
        ListNode newhead=head;int i=0;
        if(len<k)k=k%len;// prevent from TLE
        while(i++<k)
            newhead=insertAtHead(newhead);
        return newhead;
    }
}
