package a_DSA_leetcode;

public class _209_Minimum_Size_Subarray_Sum {
	public static int minSubArrayLen(int target, int[] nums) {
		
		int l = 0;
		int k = target;
		int ans = Integer.MAX_VALUE;
		int temp = 0;
		int n =  nums.length;
		
		
		for (int r = 0; r < n; r++) {
			temp += nums[r];
			
			while(temp >= k) {
				ans = Math.min(ans, r-l+1);
                temp-= nums[l];
				l++;
			}
			
		}
		
//		Return 0 if its max value
		if(ans == Integer.MAX_VALUE) {
			return 0;
		}
	
		
//		return the answer
		return ans;
		
	}

	
//	This is the main method
	public static void main(String[] args) {
		int target  = 5;
		int nums[] = {3,5,1,2,5,7,3};
		
		System.out.println(minSubArrayLen(target, nums));
	}	
}
