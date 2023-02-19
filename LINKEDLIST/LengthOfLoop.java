package LINKEDLIST;
public class LengthOfLoop {
    /*
    Ques:Given a linked list of size N. The task is to complete the function countNodesinLoop()
    that checks whether a given Linked List contains a loop or not
    and if the loop is present then return the count of nodes in a loop or else return 0.
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
    public static Node checkLoop(Node slow,Node fast)
    {
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return slow;
        }return null;
    }
    static int countNodesinLoop(Node head)
    {
        if(head==null||head.next==null)
            return 0;
        if(head.next==head)
            return 1;
        Node loop=checkLoop(head,head);//checks if loop is present or not
        if(loop==null)
            return 0;
        Node curr=loop;//set curr as loop
        int count=0;
        while(curr.next!=loop)//run the loop till curr.next!=loop[which means we heave reached the node from where we started]
        {
            curr=curr.next;count++;//make count++
        }return count+1;
    }
}
