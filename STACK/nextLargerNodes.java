package STACK;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class nextLargerNodes {
    /*
    Ques:Find the next Larger Node in List
    Approach : convert the list into arrayList and made an array of same size::
    Instead of pushing element into stack ,push the index and start the loop from index 0::
     */
    class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list= new ArrayList<>();
        ListNode temp=head;
        Stack<Integer> stack= new Stack<>();
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        //Integer[] arr= new Integer[list.size()];
        int []ans=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            while(!stack.isEmpty()&&list.get(stack.peek())<list.get(i))
                ans[stack.pop()]=list.get(i);
            stack.push(i);
        }return ans;
    }
}
