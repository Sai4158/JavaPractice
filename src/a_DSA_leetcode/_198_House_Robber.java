package a_DSA_leetcode;

public class _198_House_Robber {
	
	 public static int rob(int[] nums) {
	        
	        int n = nums.length;

	        if (n == 0) return 0;
	        if (n == 1) return nums[0];

	        int prev2 = 0; 
	        int prev1 = nums[0]; 

	        for (int i = 1; i < n; i++) {
	            int newSum = Math.max(prev1, prev2 + nums[i]); 
	            prev2 = prev1; 
	            prev1 = newSum;
	        }

	        return prev1;
	    }
		
		public static void main(String[] args) {
			int nums[] = {1,2,3,1};
			System.out.println(rob(nums)); 
		}
}
