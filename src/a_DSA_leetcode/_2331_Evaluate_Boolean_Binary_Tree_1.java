package a_DSA_leetcode;

import a_DSA_leetcode._2331_Evaluate_Boolean_Binary_Tree.TreeNode;

public class _2331_Evaluate_Boolean_Binary_Tree_1 {
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

	
	public boolean evaluateTree(TreeNode root) {

		if(root.left == null || root.right ==  null) {
			return root.val ==  1;
		}
		
		boolean leftval = evaluateTree(root.left);
		boolean rightval = evaluateTree(root.right);
		
		if(root.val == 2) {
			return leftval || rightval;
		}
		else {
			
			return leftval && rightval;
			
		}
	}
	
}
