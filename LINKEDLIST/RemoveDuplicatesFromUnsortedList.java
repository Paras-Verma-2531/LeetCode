package LINKEDLIST;
import java.util.HashSet;
public class RemoveDuplicatesFromUnsortedList {
    /*
    Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List.
     When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.
     Approach : make dummy node, check for all the nodes if data is present in hashset do nothing else: add it into hashset and into list
     return dummy.next;
     */
    class Node
    {
        int data;Node next;
        Node(int data)
        {
            this.data=data;this.next=null;
        }
    }
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head)
    {
        Node dummy=new Node(-100);
        Node temp=dummy;
        HashSet<Integer>hs=new HashSet<>();
        while(head!=null)
        {
            if(hs.contains(head.data)){}
            else
            {   hs.add(head.data);
                temp.next=head;
                temp=temp.next;

            }
            head=head.next;
        }temp.next=null;
        return dummy.next;
    }
}
