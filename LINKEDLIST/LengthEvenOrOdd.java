package LINKEDLIST;
public class LengthEvenOrOdd {
    /*
    Ques:: Given a linked list of size N, your task is to complete the function isLengthEvenOrOdd()
    which contains head of the linked list and check whether the length of linked list is even or odd.
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
    int isLengthEvenorOdd(Node head1)
    {int len=0;
        while(head1!=null)
        {
            len++;
            head1=head1.next;
        }
        return len&1;
    }
}
