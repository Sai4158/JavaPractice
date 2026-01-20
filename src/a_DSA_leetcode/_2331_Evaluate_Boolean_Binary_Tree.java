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
		
		
        // If it's a leaf node, value is either 0 (false) or 1 (true)
		if(root.left == null && root.right == null) {
			return root.val == 1;
		}
		
        // Recursively evaluate left and right subtrees
		boolean leftVal = evaluateTree(root.left);
		boolean rigtVal = evaluateTree(root.right);
		
		
        // Apply the operation based on root.vaL
		if(root.val == 2) {
			return leftVal || rigtVal;
		}
		
		
		else {
            // val == 3, AND
			return leftVal && rigtVal;
		}
		
	}


}
