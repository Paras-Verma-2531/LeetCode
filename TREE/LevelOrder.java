package TREE;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class LevelOrder {
    /*
    https://leetcode.com/problems/binary-tree-level-order-traversal/
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List <Integer>>levelOrder=new ArrayList <>();
        if(root==null)return levelOrder;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> wrapList = new ArrayList<Integer>();
        //if(root == null) return levelOrder;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int i=0;
            while(i++!=size)
            {
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                wrapList.add(queue.poll().val);
            }levelOrder.add(new ArrayList<Integer>(wrapList));
            wrapList.clear();
        }return levelOrder;
    }
}
