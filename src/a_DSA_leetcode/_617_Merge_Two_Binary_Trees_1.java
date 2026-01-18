package a_DSA_leetcode;

public class _617_Merge_Two_Binary_Trees_1 {

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


	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

		if(root1 ==  null) {
			return root2;
		}
		
		if(root2 ==  null) {
			return root1;
		}
		
		root1.val += root2.val;
		
		
		root1.left =  mergeTrees(root1.left, root2.left);
		root2.right =  mergeTrees(root1.right, root2.right);
		
		return root1;
	}

	
	public static void main(String[] args) {
        _617_Merge_Two_Binary_Trees_1 outer = new _617_Merge_Two_Binary_Trees_1();

		
		TreeNode root1 = outer.new TreeNode(1);
	        root1.left = outer.new TreeNode(3);
	        root1.right = outer.new TreeNode(2);
	        root1.left.left = outer.new TreeNode(5);

	        // root2 = [2,1,3,null,4,null,7]
	        TreeNode root2 = outer.new TreeNode(2);
	        root2.left = outer.new TreeNode(1);
	        root2.right = outer.new TreeNode(3);
	        root2.left.right = outer.new TreeNode(4);
	        root2.right.right = outer.new TreeNode(7);

	        TreeNode merged = mergeTrees(root1, root2);		
		
		
	}



}
