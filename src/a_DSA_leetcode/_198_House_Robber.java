package a_DSA_leetcode;

public class _198_House_Robber {
	
	 public static int rob(int[] nums) {
	        
	    	int n = nums.length;
	    	int count1 = 0;
	    	int count2 = 0;
	    	
	    	for (int i = 0; i < n; i += 2) { 
				count1 += nums[i]; 
	    	}
	    	
	    	for (int i = 1; i < n; i += 2) { 
				count2 += nums[i]; 
			}
	    	
	    	return Math.max(count1, count2); 
	    }
		
		public static void main(String[] args) {
			int nums[] = {1,2,3,1};
			System.out.println(rob(nums)); 
		}
}
