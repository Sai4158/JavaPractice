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

		TreeNode cur =  root;

		 while (cur != null) {

	            if (cur.val == val) {
	                return cur;           // found node -> return subtree
	            } else if (val < cur.val) {
	                cur = cur.left;       // go left
	            } else {
	                cur = cur.right;      // go right
	            }
	        }
		return null;

	}

}


