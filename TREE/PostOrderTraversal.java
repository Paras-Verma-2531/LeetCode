package TREE;

import java.util.LinkedList;
import java.util.List;
public class PostOrderTraversal {
    /*
    Ques : Given the root of a binary tree, return the postorder traversal of its nodes' values.
*/
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
