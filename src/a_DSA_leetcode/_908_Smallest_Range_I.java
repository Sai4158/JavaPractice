package a_DSA_leetcode;

public class _908_Smallest_Range_I {

	public static int smallestRangeI(int[] nums, int k) {
		// Step 1: Find the minimum and maximum values in the array
		int n = nums.length;
		int min =  nums[0];
		int max =  nums[0];

		for (int i = 0; i < n; i++) {

			if( nums[i] < k) {

				min = nums[i];

			}

			if(nums[i] > k) {
				max =  nums[i];
			}

		}
		// Step 2: Try to reduce the difference between max and min by 2*k

		int diff =  max - min;

		int reduced  = diff - 2 *k;

		// Step 3: If reduced is negative, return 0, else return reduced

		if(reduced < 0) {
			return 0;
		}

		else {
			return reduced;
		}

	}


	public static void main(String[] args) {
		int[] nums = {1, 3, 6};
		int k = 3;
		System.out.println(smallestRangeI(nums, k));
	}
}
