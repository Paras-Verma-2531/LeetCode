package LINKEDLIST;
import java.util.LinkedHashMap;
import java.util.Map;
public class Intersection_of_two_LinkedList {
    /*
    Ques: https://leetcode.com/problems/intersection-of-two-linked-lists/
    Find the intersection of two LinkedList:
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
         /*
         ==========================================
         Approach : O(N) using space of N[using hashMap]
         --->idea is to add either of the list in the map and iterate through the other and check if it's next is present
         int the map, if yes---> return the next else null;
         ==================================================
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
===================================================================
        [2] Optimised Approach : O(N) sp: constant
         ----------------------------------
         Initialize two pointers to the head of 2 list
         run the loop till a!=b and if either of them becomes null : point it to head of another list :else
         to it's next
         =======================================================
         */
        if (headA == null || headB == null) return null;
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
