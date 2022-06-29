package LINKEDLIST;
/*
Ques:: detect the cycle in LinkedList
Approach :: use floyd's cycle detection algorithm;
if at any point fast==slow [cycle is present]
*/
public class DetectCycle {
    public boolean hasCycle(ListNode head) {
        boolean cycle = false;
        ListNode slow = head, fast = head;
        if (head == null)
            return cycle;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        return cycle;
    }
}

