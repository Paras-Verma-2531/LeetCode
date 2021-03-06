package LINKEDLIST;
/* Definition for singly-linked list.
Ques:: remove the duplicates from the  Sorted list;
Approach : use the dummy pointer which points to head and initialize temp with head and prev with dummy.
if temp.val==prev.val[move temp to temp.next;]
else
[prev.next=temp;
 prev=prev.next;]
 */
  class ListNode {
    int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(-2,head);
        if(head==null)
            return head;
        ListNode temp=head,prev=dummy;
        while(temp!=null)
        {
            if(temp.val!=prev.val)
            {
                prev.next=temp;
                prev=prev.next;
            }temp=temp.next;
        }prev.next=null;// will make the further list null
        return head;
    }
}
