package a_DSA_leetcode;

import java.util.HashMap;

public class _594LongestHarmoniousSubsequence {

	
    public static int findLHS(int[] nums) {
     
    	int n = nums.length;
    	
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	
    	for (int i = 0; i < n; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
		}
    	
    	int ans =0;
    	
    	 for (int x : hm.keySet()) {
             if (hm.containsKey(x + 1)) {
                 ans = Math.max(ans, hm.get(x) + hm.get(x + 1));
             }
         }
    	 
    	 
    	 return ans;
    }
	
    
    public static void main(String[] args) {
		
    	int  nums[] = {1,3,2,2,5,2,3,7};
    	System.out.println(findLHS(nums));
    	
    	int  nums1[] = {1,2,3,4};
    	System.out.println(findLHS(nums1));
    	
    	int  nums2[] = {1,1,1,1};
    	System.out.println(findLHS(nums2));
    	
	}
    
}
