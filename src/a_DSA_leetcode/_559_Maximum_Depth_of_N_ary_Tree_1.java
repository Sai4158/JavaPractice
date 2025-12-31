package a_DSA_leetcode;

import java.util.List;

public class _559_Maximum_Depth_of_N_ary_Tree_1 {

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
        
        // Empty tree

    	if(root == null) {
    		return 0;
    	}
    	
    	
    	int max = 0;
    	
        // Check the depth of each child

    	for (Node child: root.children) {
			int childdepth = maxDepth(child);
			
			if(childdepth >  max) {
				max =  childdepth;
			}
			
			return 1 + max;
		}
    	
        // Depth of this node = 1 (itself) + max depth among children

    	return  1 + max;
    }
	
}
