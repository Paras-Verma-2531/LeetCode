package LINKEDLIST;
public class ReorderList {
    /*
    Ques: https://leetcode.com/problems/reorder-list/
     */
    public static void reorderList(ListNode head) {
        MiddleElement ml=new MiddleElement();
        ListNode secList=ml.middleNode(head);
        ListNode secondHead=new PalindromeLinkedList().reverse(secList);
        ListNode temp=head;
        secList=secondHead;
        ListNode prev1=null;
        while(temp!=null&&secList!=null)
        {
            prev1=temp.next;
            temp.next=secList;
            temp=prev1;
            prev1=secList.next;
            secList.next=temp;
            secList=prev1;
        }
        if(temp!=null)temp.next=null;
    }
}
