package POTD;
public class IsSametree {
    /*
    Ques: https://leetcode.com/problems/same-tree/
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
