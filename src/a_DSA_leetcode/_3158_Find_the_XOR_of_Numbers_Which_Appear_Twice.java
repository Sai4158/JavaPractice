package a_DSA_leetcode;

import java.util.HashMap;

public class _3158_Find_the_XOR_of_Numbers_Which_Appear_Twice {
	
    public static int duplicateNumbersXOR(int[] nums) {
        
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	int ans =0;
    	
    	int n = nums.length;
    	
    	for (int i = 0; i < n; i++) {
			
    		hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
		}
    	
    	for (int keys : hm.keySet()) {
			
    		if(hm.get(keys) == 2) {
    			ans ^= keys;
    		}
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,1,3};
		System.out.println(duplicateNumbersXOR(nums));
	
	}
}
