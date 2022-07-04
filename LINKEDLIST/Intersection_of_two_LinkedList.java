package LINKEDLIST;

import java.util.LinkedHashMap;
import java.util.Map;

public class Intersection_of_two_LinkedList {
    /*
    Ques: Find the intersection of two LinkedList:
    Approach: add the nodes of first ll to hashmap;
    insert dummy node at the beg of second ll.
    traverse from second ll and iff curr.next is present in map return node else null;
     */
    // Definition for singly-linked list.
     class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
      val = x;
      next = null;
      }
      }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> map = new LinkedHashMap<>();
        ListNode temp = headA;
        if (headA == headB)
            return headA;
        while (temp != null) {
            map.put(temp, temp.val);
            temp = temp.next;
        }
        ListNode newnode = new ListNode(-2);
        newnode.next = headB;
        ListNode curr = newnode;
        while (curr != null) {
            if ((map.containsKey(curr.next) && curr.next != null))
                return curr.next;
            curr = curr.next;
        }
        return null;

    }
}
