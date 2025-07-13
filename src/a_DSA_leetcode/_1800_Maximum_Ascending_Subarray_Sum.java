package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class _1800_Maximum_Ascending_Subarray_Sum {

	public static int maxAscendingSum(int[] nums) {

		int n = nums.length;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(nums[0]);

		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < n; i++) {

			if(nums[i] > nums[i-1]) {

				al.add(nums[i]);
				
				currentSum += nums[i];


			}else {
				al.clear();
				al.add(nums[i]);
				currentSum = nums[i];
			}
			
            maxSum = Math.max(maxSum, currentSum);

		}

		return maxSum;

	}

	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 5, 10, 50};
		System.out.println(maxAscendingSum(nums));
	}
}
