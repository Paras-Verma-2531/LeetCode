package LINKEDLIST;
/*
Ques: Reverse a Linkedlist:
Approach: use three pointers named as current,nextnode,prev;
set current as head and prev=nextnode=null;
perform these oper:
[
 nextnode = current.next;
  current.next = prev;
  prev = current;
  current = nextnode;
  ]set prev as head;return head;
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode current = head, prev = null, nextnode = null;
        while (current != null) {
            nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;
        }
        head = prev;
        return head;

    }
}
