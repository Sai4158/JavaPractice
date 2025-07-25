package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1313_Decompress_Run_Length_Encoded_List {

	public static int[] decompressRLElist(int[] nums) {

		int n = nums.length;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i+=2) {

			int freq = nums[i];
			int val = nums[i+1];

            for (int j = 0; j < freq; j++) {
				list.add(val);
			}

		}

		int result[] = new int[list.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		System.out.println(decompressRLElist(nums));
	}
}
