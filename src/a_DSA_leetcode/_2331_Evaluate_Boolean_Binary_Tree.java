package a_DSA_leetcode;

public class _2331_Evaluate_Boolean_Binary_Tree {

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
		
		if(root.left == null && root.right == null) {
			return root.val == 1;
		}
		
		boolean leftVal = evaluateTree(root.left);
		boolean rigtVal = evaluateTree(root.right);
		
		if(root.val == 2) {
			return leftVal || rigtVal;
		}
		
		else {
			return leftVal && rigtVal;
		}
		
	}


}
