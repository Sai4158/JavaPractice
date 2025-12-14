package a_DSA_leetcode;

import a_DSA_leetcode._108_Convert_Sorted_Array_to_Binary_Search_Tree.TreeNode;

public class _111_Minimum_Depth_of_Binary_Tree {

	
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
    		return 1+ minDepth(root.right);
    	}
    	
    	if(root.right ==  null) {
    		return 1 + minDepth(root.left);
    	}
    	
    	int leftDep = minDepth(root.left);
    	int rightDep =  minDepth(root.right);
    	
    	return 1 + Math.min(leftDep, rightDep);
    	
    }
    
}
