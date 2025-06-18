package a_DSA_part_71_to_part_80;

import java.util.HashSet;

public class Day71_CountCompleteSubarraysinanArray {
	
    public static int countCompleteSubarrays(int[] nums) {

    	int n =  nums.length;
    	
    	HashSet<Integer> hm =  new HashSet<Integer>();
    	
    	int total = hm.size();
    	
    	for (int i = 0; i < n; i++) {
			
    		hm.add(nums[i]);
    		
		}

    	int count = 0;
    	
    	
    	for (int i = 0; i < n; i++) {
		
    		HashSet<Integer> hs = new HashSet<Integer>();
    		
    		for (int j = i; j < n; j++) {
				
    		hs.add(nums[j]);
    		
    		if(hm.size() ==  hs.size()) {
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
