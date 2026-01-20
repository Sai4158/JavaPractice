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
	
	
	public static void main(String[] args) {
        _2331_Evaluate_Boolean_Binary_Tree obj = new _2331_Evaluate_Boolean_Binary_Tree();

        //[2,1,3,null,null,0,1]
        //      2 (OR)
        //     / \
        //    1   3 (AND)
        //       / \
        //      0   1
        TreeNode root = obj.new TreeNode(2);
        root.left = obj.new TreeNode(1);
        root.right = obj.new TreeNode(3);
        root.right.left = obj.new TreeNode(0);
        root.right.right = obj.new TreeNode(1);

        boolean result = obj.evaluateTree(root);
        System.out.println("Result: " + result);
    }


}
