package LINKEDLIST;
/*
Ques: find the middle element of the list;
Approach: Floyd's cycle detection algorithm
 */
public class MiddleElement {
    public ListNode middleNode(ListNode head) {
        if (head.next == null)
            return head;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}
