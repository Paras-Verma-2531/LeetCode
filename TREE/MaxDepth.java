package TREE;
public class MaxDepth {
    /*
    Ques: A binary tree's maximum depth is the number of nodes along the longest path
    from the root node down to the farthest leaf node.
    Approach : if root is null return 0 else return max of (root.left),root.right)+1;
     */
    public int maxDepth(TreeNode root) {
            if(root==null)
                return 0;
            int leftCount=maxDepth(root.left);
            int rightCount=maxDepth(root.right);
            return Math.max(leftCount,rightCount)+1;
        }
    }

