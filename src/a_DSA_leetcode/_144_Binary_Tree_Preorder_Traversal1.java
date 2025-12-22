package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

import a_DSA_leetcode._144_Binary_Tree_Preorder_Traversal.TreeNode;

public class _144_Binary_Tree_Preorder_Traversal1 {

	 public class TreeNode {
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
	    
	    List<Integer> ans  =  new ArrayList<Integer>();
	    preorder(root, ans);
	    
	    return ans;
	    }

	    private void preorder(TreeNode root, List<Integer> ans) {
	        if (root == null) {
	            return;
	        }

	        // Node
	        ans.add(root.val);
	        // Left
	        preorder(root.left, ans);
	        // Right
	        preorder(root.right, ans);
	    }
}
