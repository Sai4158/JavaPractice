package a_DSA_leetcode;

import a_DSA_leetcode._938_Range_Sum_of_BST.TreeNode;

public class _938_Range_Sum_of_BST_1 {

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


	public static int rangeSumBST(TreeNode root, int low, int high) {

		if(root==null) {
			return 0;
		}

		if(root.val < low) {
			rangeSumBST(root.left, low, high);	
		}
		
		
		if(root.val > high) {
			rangeSumBST(root.right, low, high);
		}
		
		
		return root.val +  rangeSumBST(root.left, low, high) +  rangeSumBST(root.right, low, high);
	}


}
