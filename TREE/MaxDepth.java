package TREE;
public class MaxDepth {
    /*
    Ques: A binary tree's maximum depth is the number of nodes along the longest path
    from the root node down to the farthest leaf node.
    Approach : if root is null return 0 else return max of (root.left),root.right)+1;
     */
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public int maxDepth(TreeNode root) {
            if(root==null)
                return 0;
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }

