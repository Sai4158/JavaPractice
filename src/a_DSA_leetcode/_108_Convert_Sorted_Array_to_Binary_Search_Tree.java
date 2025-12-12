package a_DSA_leetcode;

import a_DSA_leetcode._104_Maximum_Depth_of_Binary_Tree.TreeNode;

public class _108_Convert_Sorted_Array_to_Binary_Search_Tree {

    public static TreeNode sortedArrayToBST(int[] nums) {
        
    	return build(nums, 0 , nums.length-1);
    	
    }
    
    private static TreeNode build(int[] nums, int left, int right) {

    	
    	if(left  > right) {
    		return null;
    	}
    	
    	 int mid = left + (right - left) / 2;
         TreeNode root = new TreeNode(nums[mid]);
        
        root.left = build(nums, left, mid -1);
        root.right = build(nums, mid + 1, right);
        
    	return root;
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
