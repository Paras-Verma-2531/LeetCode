package LINKEDLIST;
public class ReverseReccursive {
    /*
    Ques:: Reverse  linkedList through recursion.
     */
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}//drfault cons
      ListNode(int val) { this.val = val; }//para cons with one value
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }// para cons with 2 value
      }
      //Method to reverse a List recursively
      public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newhead = reverseList(head.next);
        ListNode headnext = head.next;
        headnext.next = head;
        head.next = null;
        return newhead;
    }
}
