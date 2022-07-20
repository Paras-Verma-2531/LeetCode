package LINKEDLIST;
import java.util.HashMap;
import java.util.Map;
public class DeleteLoop {
    /*
    Ques: if loop is present in the list,remove the loop
    Approach: insert a dummy node at the beginning and check if its next is present in the map{if yes:: make it null}else
    put it into map:
    
     */
    class Node
    {
        int data;
        Node next;
        Node(){};
    }
    //Function to remove a loop in the linked list.
    public  void removeLoop(Node head){
        Map<Node,Integer> map=new HashMap<>();
        if(head.next==head)
            head.next=null;
        Node dummy=new Node();
        dummy.next=head;
        Node temp=dummy;
        while(temp!=null)
        {
            if(map.containsKey(temp.next))
                temp.next=null;
            else
                map.put(temp.next,temp.data);
            temp=temp.next;
        }


    }
}
