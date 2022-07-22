package TREE;

import java.util.LinkedList;
import java.util.List;
import TREE.MaxDepth;

public class PostOrderTraversal {
    List<Integer> list=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;

    }
}
