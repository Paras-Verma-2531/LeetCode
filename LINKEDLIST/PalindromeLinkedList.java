package LINKEDLIST;
/*
Ques: check whether the list is palindrome or not;
Approach : reverse the ist from mid and then place the pointer at the beginning and beg of reversed list
compare each node
if equal: move further else:
return false;
*/
public class PalindromeLinkedList {
    // returnMiddle returns the middle element
    //fast != null && fast.next != null==> returns next element to mid
    //fast.next != null && fast.next.next != null===> returns mid
    public ListNode returnMiddle(ListNode slow, ListNode fast) {
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
// reverse method reveres the list from given node
    public ListNode reverse(ListNode middle) {
        ListNode current = middle, prev = null, nextnode = null;
        while (current != null) {
            nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        ListNode slow = head, fast = head;// fast and slow approach to find middle element.
        ListNode mid = returnMiddle(slow, fast);
        ListNode start = reverse(mid);
        ListNode curr = head;
        while (start != null) {
            if (start.val != curr.val)// if at any node they are not equal return false
                return false;
            curr = curr.next;
            start = start.next;
        }
        return true;
    }
}
