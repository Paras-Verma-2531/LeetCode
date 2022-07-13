package LINKEDLIST;
public class Merge_In_Between_LinkedList {
    /*
    Ques: You are given two linked lists: list1 and list2 of sizes n and m respectively.
         Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
     */
    public ListNode getTail(ListNode node)// method which returns the tail of the list
    {
        while(node.next!=null)
        {
            node=node.next;
        }return node;
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1,anode=null,bnode=null;
        int idx=0;
        while(temp!=null)
        {
            if(idx==a-1)anode=temp;//stores a-1 node
            else if(idx==b+1)
            {
                bnode=temp;break;// b+1 node
            }temp=temp.next;idx++;
        }
        anode.next=list2;// connect a-1 with the head of second list
        getTail(list2).next=bnode;// tail of second list with b+1 node
        return list1;
    }
}
