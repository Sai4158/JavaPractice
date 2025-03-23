package a_DSA_part_51_to_part_60;

import java.util.HashMap;

public class Day56_Duplicates {

	public static boolean main(String[] args) {

		int nums[] = {1, 2, 3, 1};
		int k = 3;

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			int val = nums[i];

			if (hm.containsKey(val)) {

				int prev = hm.get(val);

				if (i - prev <= k) {
					return true;
				}
			}

			hm.put(val, i);
		}

		return false;
	}
}
