package LINKEDLIST;
public class SortList {
    /*
    Ques:https://leetcode.com/problems/sort-list/
     */
    public  ListNode findMiddle(ListNode head)
    {
        ListNode fast=head,slow=null;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow==null?head:slow.next;
            fast=fast.next.next;
        }ListNode mid=slow.next;
        slow.next=null;
        return mid;
    }
    public ListNode sortList(ListNode head)
    {
        if(head==null||head.next==null)return head;
        ListNode mid=findMiddle(head);//finds the middle
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }
    public ListNode merge(ListNode list1,ListNode list2)
    {
        ListNode newhead=new ListNode(-1);
        ListNode temp=newhead;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val){temp.next=list1;list1=list1.next;}
            else {temp.next=list2;list2=list2.next;}
            temp=temp.next;
            temp.next=list1!=null?list1:list2;
        }return newhead.next;
    }
}
