package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _442_Find_All_Duplicates_in_an_Array {

    public static List<Integer> findDuplicates(int[] nums) {
        
    	int  n  = nums.length;
    	HashMap<Integer, Integer> hm =  new HashMap<Integer, Integer>();
    	List<Integer> ans =  new ArrayList<Integer>();
    	
    	for (int i = 0; i < n; i++) {
			
    		hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
    		
		}
    	
    	for (int c : hm.keySet()) {
			
    		if(hm.get(c) == 2) {
    			ans.add(c);
    		}
    		
		}
    	
    	return ans;
    	
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {4,3,2,7,8,2,3,1};
    	
    	System.out.println(findDuplicates(nums));
    	
	}
}
