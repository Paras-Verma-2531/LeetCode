package LINKEDLIST;
public class MyLinkedList {
    /*
    Ques: Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node,
and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list.
Assume all nodes in the linked list are 0-indexed.
Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion,
 the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list.
If index equals the length of the linked list, the node will be appended to the end of the linked list.
 If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid
     */
    class Node
    {
        int data;Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }private Node head=null;private int length=0;
    public MyLinkedList() {}
    public int get(int index) {
        if(index<0||index>=length)
            return -1;
        Node curr=head;int i=0;
        while(i++<index)
            curr=curr.next;
        return curr.data;
    }

    public void addAtHead(int val) {
        Node node=new Node(val);
        if(head!=null)
            node.next=head;
        head=node;
        length++;
    }

    public void addAtTail(int val) {
        Node node=new Node(val);
        Node curr=head;
        if(head!=null)
        {
            while(curr.next!=null)
                curr=curr.next;
            curr.next=node;
        }else
            head=node;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if(index>length)return;
        if(index==0)
            addAtHead(val);
        else if(index==length)
            addAtTail(val);
        else if(index>0&&index<length)
        {
            Node curr=head;int i=0;
            Node node=new Node(val);
            while(i++<index-1)
                curr=curr.next;
            node.next=curr.next;
            curr.next=node;length++;
        }
    }
    public void deleteAtIndex(int index) {
        if(head.next==null)
        {
            head=null;length--;return;
        }
        if(index==0)
            head=head.next;
        else if(index>0&&index<=length)
        {Node curr=head;int i=0;
            while(i++<index-1)
                curr=curr.next;
            curr.next=curr.next.next;
        }
        else
            return;
        length--;
    }
}

