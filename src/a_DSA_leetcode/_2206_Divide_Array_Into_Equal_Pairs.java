package a_DSA_leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class _2206_Divide_Array_Into_Equal_Pairs {

    public static boolean divideArray(int[] nums) {
        
    	int n = nums.length;
        HashMap<Integer, Integer> hs = new HashMap<>();
    	
    	int half =  n/2;
    	
    	for (int i = 0; i < nums.length; i++) {
			hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1);
		}
    	
    	
    	for(int count: hs.values()) {
    		if( count % 2 == 0) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static void main(String[] args) {
		int nums[] = {3,2,3,2,2,2};
		System.out.println(divideArray(nums));
	}
}
