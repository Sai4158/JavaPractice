package a_DSA_leetcode;

import java.util.HashMap;

public class _219_Contains_Duplicate_II {

	
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

    	
        HashMap<Integer, Integer> hm = new HashMap<>();

        
        for (int i = 0; i < nums.length; i++) {
			
        	if(hm.containsKey(nums[i])) {
        		
        		int prev =  hm.get(nums[i]);
        		
        		if(i - prev <= k) {
        			return true;
        		}
        	}
        	
        	hm.put(nums[i], i);
		}
        
        return false;
    }
	
	   public static void main(String[] args) {
	        int nums1[] = {1, 2, 3, 1}, k1 = 3;
	    

	        System.out.println(containsNearbyDuplicate(nums1, k1)); 
	     
	    }
}
