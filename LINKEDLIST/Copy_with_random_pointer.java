package LINKEDLIST;
public class Copy_with_random_pointer {
// Definition for a Node.
    //Ques: make a copy of linkedlist with random pointers.
class Node {
    int val;
    Node next;
    Node random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
     public Node copyRandomList(Node head) {
        Node curr = head, temp = null;
        if (head == null)
            return head;
        while (curr != null)// add duplicates data after each node
        {
            temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        while (curr != null)// random linkage
        {
            if (curr.next != null) {
                curr.next.random = curr.random != null ? curr.random.next : null;
            }
            curr = curr.next.next;
        }
        Node orig = head, copy = head.next;
        temp = copy;
        while (orig != null)//seperate linkedList
        {
            orig.next = orig.next.next;
            copy.next = copy.next != null ? copy.next.next : copy.next;
            orig = orig.next;
            copy = copy.next;
        }
        return temp;

    }
}
