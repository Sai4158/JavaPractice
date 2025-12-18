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
        
//    	If tree is null, return 0
    	if(root == null) {
    		return 0;
    	}
    	
        // Get depth for each left and right tree
    	int leftDepth =  maxDepth(root.left);
    	int RightDepth =  maxDepth(root.right);
    	
//    	return 1+ (current level) + which ever is max
    	return  1 + Math.max(leftDepth, RightDepth);
    }
	
	 public static void main(String[] args) {

		 TreeNode root1 = new TreeNode(3);
	        root1.left = new TreeNode(9);
	        root1.right = new TreeNode(20);
	        root1.right.left = new TreeNode(15);
	        root1.right.right = new TreeNode(7);

	        System.out.println("Max depth of tree 1: " + maxDepth(root1)); 

	        TreeNode root2 = new TreeNode(1);
	        root2.right = new TreeNode(2);

	        System.out.println("Max depth of tree 2: " + maxDepth(root2)); 

	        TreeNode root3 = null;
	        System.out.println("Max depth of empty tree: " + maxDepth(root3)); 
	    }

}
