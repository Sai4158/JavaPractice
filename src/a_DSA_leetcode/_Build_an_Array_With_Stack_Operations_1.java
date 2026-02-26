package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _Build_an_Array_With_Stack_Operations_1 {

    public List<String> buildArray(int[] target, int n) {
        
    	List<String> ans =  new ArrayList<String>();
    	int index = 0;
    	
    	
    	for (int i = 1; i <=n; i++) {
			
    		if(index == target.length) {
    			break;
    		}
    		
    		ans.add("Push");
    		
    		if(i == target[index]) {
    			index++;
    		}
    		
    		else {
    			ans.add("Pop");
    		}
		}
    	
    	return ans;
    	
    }
    

	
}
