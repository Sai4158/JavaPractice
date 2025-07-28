package a_DSA_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class _1636_Sort_Array_by_Increasing_Frequency {

	public static int[] frequencySort(int[] nums) {

		int  n = nums.length;

		HashMap<Integer, Integer> hm =  new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);

		}

		Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);


		Arrays.sort(boxed, (a, b) -> {
			int freqA = hm.get(a);
			int freqB = hm.get(b);

			if(freqA ==  freqB) {

				return b - a;

			}

			return freqA - freqB;
		});


		for (int i = 0; i < nums.length; i++) {
			nums[i] = boxed[i];
		}

		return nums;

	}

	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 2, 2, 3};
		System.out.println(Arrays.toString(frequencySort(nums)));
	}
}
