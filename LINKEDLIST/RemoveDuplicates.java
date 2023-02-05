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
      //new Approach:: no use of prev pointer:;
      public ListNode deleteDuplicates(ListNode head) {
          if (head == null || head.next == null) return head;
          ListNode newList = new ListNode(-1);
          ListNode temp = newList;
          while (head.next != null) {
              if (head.val != head.next.val) {
                  temp.next = head;
                  temp = temp.next;
              }
              head = head.next;
          }
          temp.next = head;
          return newList.next;
      }
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode dummy=new ListNode(-2,head);
//        if(head==null)
//            return head;
//        ListNode temp=head,prev=dummy;
//        while(temp!=null)
//        {
//            if(temp.val!=prev.val)
//            {
//                prev.next=temp;
//                prev=prev.next;
//            }temp=temp.next;
//        }prev.next=null;// will make the further list null
      //[1,1,1,1,1,1,1] if prev.next is not null it will return the whole list:: therefore make prev.next as null
//        return head;
  }
