package a_DSA_leetcode;

public class _110_Balanced_Binary_Tree {

	
    public static boolean isBalanced(TreeNode root) {
        
    	return checkHeight(root) != -1;
    	
    }
    

     private static int checkHeight(TreeNode root) {
		// TODO Auto-generated method stub
		return 0;
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
    
    
    public static void main(String[] args) {
		
	}
}
