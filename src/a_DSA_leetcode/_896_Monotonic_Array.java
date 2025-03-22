package a_DSA_leetcode;

public class _896_Monotonic_Array {

	public static boolean isMonotonic(int[] nums) {

		int n = nums.length;
		boolean incresing = true;  
		boolean decreasing = true;  

		for (int i = 0; i < n - 1; i++) {

			if (nums[i] > nums[i + 1]) {
				incresing = false;
			}

			if (nums[i] < nums[i + 1]) {
				decreasing = false;
			}
		}

		return incresing || decreasing;

	}

	public static void main(String[] args) {

		int nums[] = {1,2,2,3};

		System.out.println(isMonotonic(nums));
	}
}
