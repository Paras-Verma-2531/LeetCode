package TREE;
public class SameTree {
    /*
    Ques: Given the roots of two binary trees p and q, write a function to check if they are the same or not.
      Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        if(p==null&&q!=null)
            return false;
        if(p!=null&&q==null)
            return false;
        boolean res1=isSameTree(p.left,q.left);
        boolean res2=isSameTree(p.right,q.right);
        boolean res3=p.val==q.val;
        return res1&&res2&&res3;
    }
}
