package TREE;
import java.util.LinkedList;
public class SortedListToBinaryTree {
    
    public TreeNode makeTree(int start,int end,LinkedList<Integer>list)
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode curr= new TreeNode(list.get(mid));
        curr.left=makeTree(start,mid-1,list);
        curr.right=makeTree(mid+1,end,list);
        return curr;
    }
    public TreeNode sortedListToBST(ListNode head) {
        LinkedList<Integer> list=new LinkedList<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        return makeTree(0,list.size()-1,list);
    }
}
