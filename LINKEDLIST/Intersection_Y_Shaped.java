package LINKEDLIST;
import java.util.HashMap;
import java.util.Map;
public class Intersection_Y_Shaped {
    /*
    Ques:Given two singly linked lists of size N and M,
    write a program to get the point where two linked lists intersect each other.
    Approach : add one of the list to the hashmap and then check for the second if it's next is present in
    the map, if yes{return next.data, else -1}
*/
     class Node
    {
        private int data;
        private Node next;
         Node(int data){this.data=data;this.next=null;}
    }
    int intersectPoint(Node head1, Node head2)
    {
        Node dummy =new Node(-10001);
        dummy.next=head1;
        Map<Node,Integer> map=new HashMap<>();Node temp=head2;
        while(temp!=null)
        {
            map.put(temp,temp.data);
            temp=temp.next;
        }
        temp=dummy;
        while(temp!=null)
        {
            if(map.containsKey(temp.next))
                return temp.next.data;
            temp=temp.next;
        }return -1;
    }
}
