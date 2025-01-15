package a_DSA_leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class _3005_Count_Elements_With_Maximum_Frequency {

	public static int maxFrequencyElements(int[] nums) {
		HashMap<Integer, Integer> hs = new HashMap<>();

		int maxFrequency = 0;
		int totalFrequency = 0;

		for (int num : nums) {
			hs.put(num, hs.getOrDefault(num, 0) + 1);
			maxFrequency = Math.max(maxFrequency, hs.get(num));
		}

		for (int key : hs.keySet()) {
			if (hs.get(key) == maxFrequency) {
				totalFrequency += maxFrequency;
			}
		}

		return totalFrequency;
	}

	public static void main(String[] args) {

		int nums[] = {1,2,2,3,1,4};
		System.out.println(maxFrequencyElements(nums));
	}


}
