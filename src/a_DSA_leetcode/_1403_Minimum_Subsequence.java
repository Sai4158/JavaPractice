package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1403_Minimum_Subsequence {

	public static List<Integer> minSubsequence(int[] nums) {

		Arrays.sort(nums);

		int total = 0;

		for (int i = 0; i < nums.length; i++) {

			total += nums[i];
		}

		List<Integer> ans = new ArrayList<Integer>();

		int temp = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			temp += nums[i];
			ans.add(nums[i]);
			if (temp > total - temp) {
				break;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int nums[] = {4, 3, 10, 9, 8};
		System.out.println(minSubsequence(nums)); 
	}
}
