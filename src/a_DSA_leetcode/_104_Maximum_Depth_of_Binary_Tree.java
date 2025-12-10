package a_DSA_leetcode;

public class _104_Maximum_Depth_of_Binary_Tree {

    public static int maxDepth(TreeNode root) {
       
//    	If tree is null, return 0
    	if(root == null) {
    		return 0;
    	}
    	
        // Get depth for each left and right tree
    	int leftDepth =  maxDepth(root.left);
    	int RightDepth =  maxDepth(root.right);
    	
//    	return 1+ (current level) + which ever is max
    	return  1 + Math.max(leftDepth, RightDepth);
    }
    
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
}
