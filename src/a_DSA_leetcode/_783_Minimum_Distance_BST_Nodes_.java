package a_DSA_leetcode;

public class _783_Minimum_Distance_BST_Nodes_ {

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


	Integer prev =  null;
	int ans = Integer.MAX_VALUE;
	
	public int minDiffInBST(TreeNode root) {
		
		inorder(root);
		return ans;
		
	}


	private void inorder(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		
		if(prev != null) {
			ans = Math.min(ans, root.val - prev);
		}
		
		prev = root.val;
		
        inorder(root.right);
	}


	public static void main(String[] args) {

	}
}
