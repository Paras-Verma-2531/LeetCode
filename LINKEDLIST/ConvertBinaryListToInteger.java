package LINKEDLIST;
public class ConvertBinaryListToInteger {
    /*
    Ques: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
    Given head which is a reference node to a singly-linked list.
    The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list
     */
    public ListNode reverse(ListNode head)//reverse the list
    {
        if(head.next==null)return head;
        ListNode newhead=reverse(head.next);
        ListNode node=head.next;
        node.next=head;
        head.next=null;
        return newhead;
    }
    public int getDecimalValue(ListNode head) {
        head=reverse(head);
        int sum=0,i=0;
        while(head!=null)
        {
            sum+=head.val*Math.pow(2,i++);// converts the no into integer
            head=head.next;
        }return sum;
    }
}
