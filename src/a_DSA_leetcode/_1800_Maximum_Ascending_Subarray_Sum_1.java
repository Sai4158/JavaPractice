package a_DSA_leetcode;

public class _1800_Maximum_Ascending_Subarray_Sum_1 {

	public static int maxAscendingSum(int[] nums) {
		
		int n = nums.length;
		int maxsum = nums[0];
		int currentSum = nums[0];
		
		for (int i = 1; i < n; i++) {
			
			if(nums[i] > nums[i-1]) {
				currentSum += nums[i];
			}else {
				currentSum =  nums[i];
			}
			
			if(currentSum >  maxsum) {
				maxsum = currentSum;
			}
			
		}
		
		return maxsum;
	}
	
	public static void main(String[] args) {
		int nums[] = {10,20,30,5,10,50};
		System.out.println(maxAscendingSum(nums));
	}
	
}
