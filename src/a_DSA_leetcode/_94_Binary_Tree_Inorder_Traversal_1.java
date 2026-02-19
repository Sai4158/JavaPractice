package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _94_Binary_Tree_Inorder_Traversal_1 {

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

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> ans = new ArrayList<Integer>();
		
		inorder(root,ans);
		
		return ans;
		
	}

	private void inorder(TreeNode root, List<Integer> ans) {
		
		if(root == null) {
			return;
		}
		
		inorder(root.left, ans);
		ans.add(root.val);
		inorder(root.right, ans);
		
	}
}
