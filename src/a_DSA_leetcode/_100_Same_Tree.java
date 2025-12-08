package a_DSA_leetcode;import java.time.chrono.IsoChronology;

public class _100_Same_Tree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        
    	if(p == null && q == null) {
    		return true;
    	}
    	
    	if(p == null || q == null) {
    		return false;
    	}
    	
    	if(p.val != q.val) {
    		return false;
    	}
    	
    	boolean leftSame = isSameTree(p.left, q.left);
    	boolean rightSame = isSameTree(p.right, q.right);
    	
    	
    	return leftSame && rightSame;
    }
    
    

	
    public  class TreeNode {
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
