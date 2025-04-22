package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1441_Build_an_Array_With_Stack_Operations {
	
    public static List<String> buildArray(int[] target, int n) {
        
    	int index = 0;
    	List<String> ans =  new ArrayList<String>();
    	
    	for (int i = 1; i <= n; i++) {
			
    		if(index == target.length) {
    			break;
    		}
    		
    		if(target[index] == i) {
    			ans.add("Push");
    			index++;
    			
    		}else {
    			ans.add("Push");
    			ans.add("Pop");
    		}
    		
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		int target[] = {1,3};
		int n =  3;
		
		System.out.println(buildArray(target, n));
	}
}
