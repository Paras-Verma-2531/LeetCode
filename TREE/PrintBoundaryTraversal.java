package TREE;
import java.util.ArrayList;
import java.util.Stack;

public class PrintBoundaryTraversal {
    private static boolean isLeaf(TreeNode root)
    {
        return ((root.left==null)&&(root.right==null));
    }
    private static void addLeftBoundary(TreeNode root, ArrayList<Integer>ans)
    {
        TreeNode curr=root.left;
        while(curr!=null)
        {
            if(!isLeaf(curr))ans.add(curr.val);
            if(curr.left!=null)curr=curr.left;
            else curr=curr.right;
        }
    }
    private static void addLeaves(TreeNode root,ArrayList<Integer>ans)
    {
        if(isLeaf(root))
        {
            ans.add(root.val);
            return;
        }
        if(root.left!=null)addLeaves(root.left,ans);
        if(root.right!=null)addLeaves(root.right,ans);
    }
    private static void addRightBoundary(TreeNode root, ArrayList < Integer > res) {
        TreeNode cur = root.right;
        Stack< Integer > tmp = new Stack <>();
        while (cur != null) {
            if (!isLeaf(cur)) tmp.push(cur.val);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }while(!tmp.isEmpty())res.add(tmp.pop());
        }
    public static void printBoundaryTraversal(TreeNode root)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(root.val);
        //add Left Boundary Nodes:
        addLeftBoundary(root,ans);
        //add Lead Nodes:
        addLeaves(root,ans);
        //add right boundary
        addRightBoundary(root,ans);
    }
}
