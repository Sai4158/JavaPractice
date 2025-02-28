package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class _3046_Split_the_Array {
	
    public static boolean isPossibleToSplit(int[] nums) {
    	
    	HashMap<Integer, Integer>hm =  new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
		}
    	
    	for(Integer a : hm.keySet()) {
    		
    		if(hm.get(a) > 2) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 3, 4}; 
        System.out.println(isPossibleToSplit(nums1));
    }
}
