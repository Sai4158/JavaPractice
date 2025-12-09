package a_DSA_leetcode;

public class _101_Symmetric_Tree {

    public static boolean isSymmetric(TreeNode root) {
        
    	return isMirror(root.left, root.right);
    	
    }
    
     private static boolean isMirror(TreeNode a, TreeNode b) {

    	 if(a == null && b == null) {
    		 return true;
    	 }
    	 
    	 if(a== null || b==null) {
    		 return false;
    	 }
    	 
    	  if(a.val != a.val) {
    		  return false;
    	  }
    	 
    	 return isMirror(a.left, b.right) && isMirror(a.right, b.left); 
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
