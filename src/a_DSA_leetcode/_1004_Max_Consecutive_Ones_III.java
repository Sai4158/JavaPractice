package a_DSA_leetcode;

public class _1004_Max_Consecutive_Ones_III {
	
	 public static int longestOnes(int[] nums, int k) {
		 
		 int temp = 0;
		 int l = 0;
		 int ans = 0;
		 int n = nums.length;
		 
		 
		 for (int r = 0; r < n; r++) {
			
			 if(nums[r] == 0) {
				 temp++;
			 }
			 
			 
			 while(temp > k) {
				 if(nums[l] == 0) {
					 temp--;
				 }
				 l++;
			 }
			 ans = Math.max(ans, r-l+1);
		 }
		 return ans;
	   }
	
	
	
	 
	 
//	 Main method
	public static void main(String[] args) {
		
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k  = 2;
		System.out.println(longestOnes(nums, k));
	}
}
