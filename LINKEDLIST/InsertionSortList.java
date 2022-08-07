package LINKEDLIST;
public class InsertionSortList {
    /*
    Ques: Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(-5001);
        //ListNode newhead=dummy;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode temp=dummy;
            while(temp.next!=null&&temp.next.val<curr.val)
                temp=temp.next;
            ListNode next=curr.next;
            curr.next=temp.next;
            temp.next=curr;
            curr=next;
        }return dummy.next;
    }
}
