package STACK;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
/*
Ques: Print the PreOrder traversal of tree iterative approach::
Approach: Use stack for the traversal:
 */
public class PreOrderTraversal {
    //* Definition for a binary tree node.
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
      public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer>ls= new LinkedList<>();// returns the list of elements
            Stack<TreeNode> stack= new Stack<>();// stack of TreeNode type
            TreeNode curr=root;
            while(curr!=null)
            {
                ls.add(curr.val);// add into list
                if(curr.right!=null)// push the right child into stack
                    stack.push(curr.right);
                if(curr.left!=null)
                    curr=curr.left;//  make the left child as curr
                else// leaf node
                    curr=stack.isEmpty()?null:stack.pop();// pick up the node from stack if exists else null
            }return ls;
        }
    }
