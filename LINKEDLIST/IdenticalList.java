package LINKEDLIST;
public class IdenticalList {
    /*
    Ques: Given two Singly Linked List of N and M nodes respectively.
    The task is to check whether two linked lists are identical or not.
     Two Linked Lists are identical when they have same data and with same arrangement too.
     */
    class Node
    {
        int data;Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        Node curr1=head1,curr2=head2;
        while(curr1!=null&&curr2!=null)
        {
            if(curr1.data!=curr2.data)
                return false;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return curr1==null&&curr2==null;
    }
}
