package a_DSA_leetcode;

public class _938_Range_Sum_of_BST {

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
        
    	if(root == null) {
    		return 0;
    	}
    	
        // If value is smaller than low, ignore left subtree

    	if(root.val <low) {
    		return rangeSumBST(root.right, low, high);
    	}
    	
        // If value is greater than high, ignore right subtree

    	if(root.val > high) {
    		return rangeSumBST(root.left, low, high);
    	}
    	
    	
    	return root.val + rangeSumBST(root.left, low, high) +  rangeSumBST(root.right, low, high);
    	
    }
    
    
    
    
	
}
