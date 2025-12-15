package a_DSA_leetcode;

import a_DSA_leetcode._111_Minimum_Depth_of_Binary_Tree.TreeNode;

public class _111_Minimum_Depth_of_Binary_Tree_1 {

	
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
	
	
	   public static int minDepth(TreeNode root) {
	        
	    	if(root == null) {
	    		return 0;
	    	}
	    	
	    	if(root.left == null && root.right == null) {
	    		return 1;
	    	}
	    	
	    	if(root.left == null) {
	    		return  1 + minDepth(root.right);
	    	}
	    	
	    	if(root.right ==  null) {
	    		return 1 + minDepth(root.left);
	    	}
	    	
	    	int leftDep =  minDepth(root.left);
	    	int RightDep =  minDepth(root.right);
	    	
	    	return  1 + Math.min(leftDep, RightDep);
	    	
	    }
	   
	   
}
