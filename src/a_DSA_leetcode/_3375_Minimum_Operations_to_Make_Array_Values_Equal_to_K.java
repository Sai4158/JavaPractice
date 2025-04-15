package a_DSA_leetcode;

import java.util.HashSet;

public class _3375_Minimum_Operations_to_Make_Array_Values_Equal_to_K {

	public static int minOperations(int[] nums, int k) {

		int n = nums.length;
		HashSet<Integer> hm = new HashSet<Integer>();


		for (int i = 0; i < nums.length; i++) {

			if(nums[i] < k) {
				return -1;
			}

		}


		for (int i = 0; i < nums.length; i++) {

			if(nums[i]>k) {
				hm.add(nums[i]);
			}
		}

		return hm.size();

	}

	public static void main(String[] args) {
		int[] nums = {5, 2, 5, 4, 5};
		int k = 2;

		System.out.println(minOperations(nums, k));
	}
}
