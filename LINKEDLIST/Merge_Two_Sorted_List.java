package LINKEDLIST;
public class Merge_Two_Sorted_List {
    /*
    Ques: Merge Two Sorted List:
    Approach:: use similar approach of merge sort[conquer]
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head= new ListNode(0);
        ListNode temp=head;
        while(list1!=null&& list2!=null)// till either of list becomes null
        {
            if(list1.val<list2.val)
            {
                temp.next=list1;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                list2=list2.next;
            }temp=temp.next;
        }
        temp.next=list1!=null?list1:list2;// insert the not null list
        return head.next;// since first node is dummy
    }
}
