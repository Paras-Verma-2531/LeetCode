package LINKEDLIST;
import java.util.HashMap;
import java.util.Map;
public class RemoveZeroSumSubList {
    /*
    Ques::Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0
    until there are no such sequences.
After doing so, return the head of the final linked list.  You may return any such answer
     */
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;int sum=0;
        while(temp!=null)
        {
            sum+=temp.val;
            map.put(sum,temp);//it will update the value if key already exists.
            temp=temp.next;
        }sum=0;
        temp=dummy;
        while(temp!=null)
        {
            sum+=temp.val;
            if(map.containsKey(sum))
            {
                ListNode node=map.get(sum);
                if(temp!=node)// to check if we are on the same node
                    temp.next=node.next;// point to it's next node
            }temp=temp.next;
        }return dummy.next;
    }
}
