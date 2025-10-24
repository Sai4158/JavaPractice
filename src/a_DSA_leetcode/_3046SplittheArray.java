package a_DSA_leetcode;

import java.util.HashMap;

public class _3046SplittheArray {

    public static boolean isPossibleToSplit(int[] nums) {
        
    	int n = nums.length;
    	
    	HashMap<Integer, Integer> hm =  new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < n; i++) {
			
    		hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
    		
		}
    	
    	for(int c : hm.keySet()) {
    		
    		if(hm.get(c) >  2) {
    			return false;
    		}
    		
    	}
    		
    	return true;
    }
	
	public static void main(String[] args) {
		
	}
}
