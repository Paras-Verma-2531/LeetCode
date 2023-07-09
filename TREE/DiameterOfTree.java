package TREE;
public class DiameterOfTree {
    /*
    https://leetcode.com/problems/diameter-of-binary-tree/
     */
    public int dfsHeight(TreeNode root,int[] maxi)
    {
        if(root==null)return 0;
        int lh=dfsHeight(root.left,maxi);
        int rh=dfsHeight(root.right,maxi);
        maxi[0]=Math.max(lh+rh,maxi[0]);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int []diameter=new int[1];
        dfsHeight(root,diameter);
        return diameter[0];
    }
}
