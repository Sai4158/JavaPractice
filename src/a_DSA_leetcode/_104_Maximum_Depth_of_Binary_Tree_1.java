package a_DSA_leetcode;

import a_DSA_leetcode._111_Minimum_Depth_of_Binary_Tree_1.TreeNode;

public class _104_Maximum_Depth_of_Binary_Tree_1 {

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
	
	public static int maxDepth(TreeNode root) {
	       
		if(root == null) {
			return 0;
		}
		
		int leftDep =  maxDepth(root.left);
		int RightDep =  maxDepth(root.right);
		
		
		return 1 + Math.max(leftDep, RightDep);
    }
	
	

}
