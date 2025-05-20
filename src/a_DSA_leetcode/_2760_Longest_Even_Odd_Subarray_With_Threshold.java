package a_DSA_leetcode;

public class _2760_Longest_Even_Odd_Subarray_With_Threshold {
	
	public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int maxLen = 0;

        for (int l = 0; l < n; l++) {
            if (nums[l] % 2 != 0 || nums[l] > threshold) {
                continue; 
            }

            int r = l;
            
            while (r < n && nums[r] <= threshold && (r == l || nums[r] % 2 != nums[r - 1] % 2)) {
                r++;
            }

            maxLen = Math.max(maxLen, r - l);
        }

        return maxLen;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {3,2,5,4}, threshold = 5;
		System.out.println(longestAlternatingSubarray(nums, threshold));
	}
}
