package TREE;
import java.util.ArrayList;
import java.util.List;
public class rightView {
    /*
    https://leetcode.com/problems/binary-tree-right-side-view/
     */
    private void rightViewUtil(TreeNode root, List<Integer>list, List <Integer> temp, int level)
    {
        if(root==null)return;
        if(!temp.contains(level))
        {
            temp.add(level);
            list.add(root.val);
        }
        rightViewUtil(root.right,list,temp,level+1);
        rightViewUtil(root.left,list,temp,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList <>();
        rightViewUtil(root,ans,new ArrayList<Integer>(),0);
        return ans;
    }
}
