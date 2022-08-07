package LINKEDLIST;

import java.util.Stack;
public class Flatten_DoubleLinkedList {
    /*
    Ques: You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer,
    and an additional child pointer.
    This child pointer may or may not point to a separate doubly linked list, also containing these special nodes.
    Approach: O(N): if node.child!=null ==>push the node.next into stack if it is not null.
    and make node.child.prev=node
    node.next=node.child;
    now if stack is not empty ,check if child and next==null {pop out the node from stack)
    make child =null and node=node.next;
     */
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
    public Node flatten(Node head) {
        Stack<Node> stack = new Stack<>();
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                if (curr.next != null) stack.push(curr.next);//if it is null don't push it
                curr.child.prev = curr;
                curr.next = curr.child;
            }
            //System.out.println(stack.peek());
            if (!stack.isEmpty()) {
                if (curr.child == null && curr.next == null) {
                    stack.peek().prev = curr;
                    curr.next = stack.pop();
                }
            }
            curr.child = null;
            curr = curr.next;
        }
        return head;
    }
}
