package LINKEDLIST;

public class RemoveElements {
    /**
     Ques: Remove the occurence of val from the list.
     Approach:
     create a dummy node with head as its next.
     point temp to head and prev to dummy.
     if(temp.val!=val)[make link]
     else
     move temp forward;
     return dummy.next;
     */

    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        ListNode dummy = new ListNode(0, head);
        ListNode temp = head, prev = dummy;

        while (temp != null) {
            if (temp.val != val) {
                prev.next = temp;
                prev = prev.next;
            }
            temp = temp.next;
        }
        prev.next = null;
        return dummy.next;
    }
}

