package LINKEDLIST;

import java.util.LinkedList;

public class InsertDuplicates_After_eachNode {
    static class Node
    {int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void insertDuplicates(Node head)
    {
        Node curr=head,temp=null;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=temp;
            curr=temp;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node node1=new Node(2);head.next=node1;
        Node node2=new Node(3);node1.next=node2;
        Node node3=new Node(4);node2.next=node3;
        Node node4=new Node(5);node3.next=node4;
        new InsertDuplicates_After_eachNode().insertDuplicates(head);
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
