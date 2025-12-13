package a_DSA_leetcode;

public class _110_Balanced_Binary_Tree {

	
    public static boolean isBalanced(TreeNode root) {
        
    	return checkHeight(root) != -1;
    	
    }
    

     private static int checkHeight(TreeNode node) {
	
    	 if(node ==  null) {
    		 return 0;
    	 }
    	 
    	 int leftheight =  checkHeight(node.left);
    	 if(leftheight == -1) {
    		 return  -1;
    	 }
    	 
    	 int rightheight = checkHeight(node.right);
    	 if(rightheight == -1) {
    		 return -1;
    	 }
    	 
    	 
    	 if(Math.abs(leftheight -  rightheight)>1) {
    		 return  -1;
    	 };
    	 
    	 
		return 1 + Math.max(leftheight, rightheight);
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
