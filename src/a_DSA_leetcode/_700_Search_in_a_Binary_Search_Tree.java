package a_DSA_leetcode;

public class _700_Search_in_a_Binary_Search_Tree {

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

		TreeNode current =  root;

		while(current != null) {

			if(current.val ==  val) {
				return current;
			}

			else if (val < current.val) {
				current =  current.left;
			}

			else {
				current =  current.right;
			}

		}
		return null;

	}

}


