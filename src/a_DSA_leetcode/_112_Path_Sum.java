package a_DSA_leetcode;

import a_DSA_leetcode._111_Minimum_Depth_of_Binary_Tree_1.TreeNode;

public class _112_Path_Sum {

	
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
	
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        
    	if(root ==  null) {
    		return false;
    	}
    	
    	if(root.left == null && root.right == null) {
    		return targetSum == root.val;
    	}
    	
    	int newTarget = targetSum -  root.val;
    	
    	
    	return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
    	
    }
    
    public static void main(String[] args) {
		
	}
	
}
