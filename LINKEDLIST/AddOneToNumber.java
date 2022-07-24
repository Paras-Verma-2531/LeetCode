package LINKEDLIST;
public class AddOneToNumber {
    /*
    Ques::A number N is represented in Linked List such that each digit corresponds to a node in linked list.
    You need to add 1 to it.
    Approach:: Time Comp:: O(N)
    Space Comp:: O(1)
    :: Reverse a list  add 1 to head.data and then follow the sum carry approach
    again reverse the list
    if carry!=0 add node to head
    return head;
     */
    static class Node
    {
        int data;Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node reverse(Node head)// to reverse a List
    {
        if(head.next==null)
            return head;
        Node newhead=reverse(head.next);
        Node newnode=head.next;
        newnode.next=head;
        head.next=null;
        return newhead;
    }
    public static Node addOne(Node head)
    {
        Node newhead=reverse(head);
        Node curr=newhead;
        curr.data+=1;
        int carry=0,sum=0;
        while(curr!=null)
        {
            curr.data+=carry;
            carry=curr.data/10;
            sum=curr.data%10;
            curr.data=sum;
            curr=curr.next;
        }
        head=reverse(newhead);
        if(carry!=0)// if last no was 9
        {
            Node node=new Node(carry);
            node.next=head;
            head=node;// make it head
        }
        return head;
    }
}
