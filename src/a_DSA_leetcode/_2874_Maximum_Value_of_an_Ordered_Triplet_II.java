package a_DSA_leetcode;

public class _2874_Maximum_Value_of_an_Ordered_Triplet_II {
	
    public static long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] maxSuffix = new int[n];
        maxSuffix[n - 1] = nums[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            maxSuffix[i] = Math.max(nums[i], maxSuffix[i + 1]);
        }

        long maxValue = 0;
        int maxLeft = nums[0];
        
        for (int j = 1; j < n - 1; j++) {
            maxLeft = Math.max(maxLeft, nums[j - 1]);
            long val = (long)(maxLeft - nums[j]) * maxSuffix[j + 1];
            maxValue = Math.max(maxValue, val);
        }

        return maxValue;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {12,6,1,2,7};
		System.out.println(maximumTripletValue(nums));
		
	}
}
