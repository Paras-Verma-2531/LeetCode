package LINKEDLIST;
import java.util.ArrayList;
import java.util.Stack;
public class NextGreaterNode {
    /*
    Ques:: You are given the head of a linked list with n nodes.
For each node in the list, find the value of the next greater node. That is, for each node,
find the value of the first node that is next to it and has a strictly larger value than it.
Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed).
If the ith node does not have a next greater node, set answer[i] = 0
*/
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        int[] arr=new int[list.size()];
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&stack.peek()<=list.get(i))//pop out the element until the larger no. is found
                stack.pop();
            arr[i]=stack.isEmpty()?0:stack.peek();// set arr[i] as 0 if stack is empty else stack.peek()
            stack.push(list.get(i));
        }return arr;
    }
}
