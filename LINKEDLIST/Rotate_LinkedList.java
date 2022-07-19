package LINKEDLIST;
public class Rotate_LinkedList {
    /*
    Ques: Given a singly linked list of size N. The task is to left-shift the linked list by k nodes,
    where k is a given positive integer smaller than or equal to length of the linked list.
    Approach: Remove the head from beginning and insert it at the end and make the new head
    follow the process for k times
     */
    class Node
    {
        private int data;
        private Node next;
        Node(int data){this.data=data;this.next=null;}
    }
    public Node addAtLast(Node head)
    {
        Node temp=head.next;
        Node curr=head.next;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=head;
        head.next=null;
        return temp;
    }
    public Node rotate(Node head, int k) {
        if(head.next==null)
            return head;
        Node newhead=head;int i=0;
        while(i++<k)
            newhead=addAtLast(newhead);
        return newhead;


    }
}
