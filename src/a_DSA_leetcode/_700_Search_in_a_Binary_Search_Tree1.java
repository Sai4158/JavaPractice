package a_DSA_leetcode;

import a_DSA_leetcode._100_Same_Tree.TreeNode;

public class _700_Search_in_a_Binary_Search_Tree1 {

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
	
	public TreeNode searchBST(TreeNode root, int val) {

		TreeNode curr = root;
		
		while(curr !=  null) {
			if(curr.val == val) {
				return curr;
			}
			
			else if(curr.val == val) {
				curr =  curr.left;
			}
			
			else {
				curr =  curr.right;
			}
		}
		return null;
	}
	
}
