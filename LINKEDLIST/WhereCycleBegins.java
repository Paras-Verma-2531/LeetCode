package LINKEDLIST;
public class WhereCycleBegins {
    /*
    Ques: find the node where cycle begins:
    Approach: check if the cycle is present or not using floyd's cycle detection algo
    if present: start the loop till temp!=slow and return temp[temp will point to the node where cycle begins]
    make temp and slow temp.next.slow.next

     */
    public ListNode cycle(ListNode slow,ListNode fast)
    {
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
                return slow;
        }return null;

    }
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        ListNode temp=cycle(head,head);
        if(temp==null)
            return null;
        ListNode curr=head;
        while(curr!=temp)
        {
            curr=curr.next;
            temp=temp.next;
        }return curr;
    }
    /*
    2nd Approach through HashMap::
    Map<ListNode,Integer>map=new HashMap<>();
        ListNode dummy=new ListNode(-100001);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp!=null)
        {
            if(map.containsKey(temp.next))
                return temp.next;
            map.put(temp,temp.val);
            temp=temp.next;
        }return null;
     */
}
