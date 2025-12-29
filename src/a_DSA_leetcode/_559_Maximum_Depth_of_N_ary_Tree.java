package a_DSA_leetcode;

import java.util.List;

public class _559_Maximum_Depth_of_N_ary_Tree {

	
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	
	
    public static int maxDepth(Node root) {
        
    	
    	if(root == null) {
    		return 0;
    	}
    	
    	
    	int max = 0;
    	
    	for(Node child:root.children) {
    		int childDepth = maxDepth(child);
    		
    		if(childDepth > max) {
    			max = childDepth;
    		}
    	}
    	
    	
    	return  1 + max;
    }
	
}
