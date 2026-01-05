package a_DSA_leetcode;

public class _226_Invert_Binary_Tree {

	
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
	
    public static TreeNode invertTree(TreeNode root) {
        
    	
    	if(root ==  null) {
    		return null;
    	}
    	
    	TreeNode LeftInverted =  invertTree(root.left);
    	TreeNode RightyInverted =  invertTree(root.right);
    	
    	root.left =  RightyInverted;
    	root.right =  LeftInverted;
    	
    	
    	return root;
    		
    }
    
    
	
}
