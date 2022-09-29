package LINKEDLIST;
public class Add_Two_Numbers {
    /*
    Ques: https://leetcode.com/problems/add-two-numbers/
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
     Add the two numbers and return the sum as a linked list.

     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int sum=0,carry=0;
        while(l1!=null||l2!=null)
        {
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;
            sum=val1+val2+carry;
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
            temp=temp.next;
        }
        if(carry!=0)
            temp.next=new ListNode(carry);
        return dummy.next;
    }
}
