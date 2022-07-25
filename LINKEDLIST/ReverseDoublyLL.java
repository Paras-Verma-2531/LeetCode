package LINKEDLIST;
public class ReverseDoublyLL {
    /*
    Ques:: Given a doubly linked list of n elements. The task is to reverse the doubly linked list.
     */
    class Node
    {
        int data;Node next,prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node reverseDLL(Node  head)
    {
        Node curr=head,prev=null,nextnode=null;
        while(curr!=null)
        {
            nextnode=curr.next;//move to next node
            curr.next=prev;// it's next will point to it's prev
            curr.prev=nextnode;//it's prev will point to it's next
            prev=curr;//set prev as curr
            curr=nextnode;//curr as nextnode
        }return prev;
    }
}
