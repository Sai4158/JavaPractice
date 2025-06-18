package a_DSA_leetcode;

import java.util.HashSet;

public class _2799_Count_Complete_Subarrays_in_an_Array {
	
    public static int countCompleteSubarrays(int[] nums) {
        
    	int n =  nums.length;
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
    	for (int i = 0; i < n; i++) {
			
    		hs.add(nums[i]);
		}
    	
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		HashSet<Integer> fresh = new HashSet<Integer>();
    		
    		for (int j = i; j < n; j++) {
				
    			fresh.add(nums[j]);
    			
    			if(hs.size() ==  fresh.size()) {
    				count++;
    			}
			}
    		
		}
    	
    	return count;
    	
    }
	
	public static void main(String[] args) {
		int nums[] = {1,3,1,2,2};
		System.out.println(countCompleteSubarrays(nums));
	}
}
