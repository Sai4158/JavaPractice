package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

import a_DSA_leetcode._144_Binary_Tree_Preorder_Traversal1.TreeNode;

public class _145_Binary_Tree_Postorder_Traversal {

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
	 
	 
	    public static List<Integer> postorderTraversal(TreeNode root) {
	        
	    	List<Integer> ans =  new ArrayList<Integer>();
	    	
	    	postOrder(root, ans);
	    	
	    	return ans;
	    	
	    }


		private static void postOrder(TreeNode root, List<Integer> ans) {

			if(root == null) {
				return;
			}
			
			postOrder(root.left, ans);			
			postOrder(root.right, ans);
			ans.add(root.val);

		}
	    
	    
}
