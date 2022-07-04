package LINKEDLIST;

public class ReverseReccursive {
    /*
    Ques:: Reverse  linkedList through recursion.
     */
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

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
