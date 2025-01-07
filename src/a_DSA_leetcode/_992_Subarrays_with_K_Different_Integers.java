package a_DSA_leetcode;

import java.util.HashMap;

public class _992_Subarrays_with_K_Different_Integers {

	public static int atMostK(int[] nums, int k) {
		int l = 0;
		int ans = 0;

		HashMap<Integer, Integer> h1 = new HashMap<>();

		for (int r = 0; r < nums.length; r++) {
			h1.put(nums[r], h1.getOrDefault(nums[r], 0) + 1);

			while (h1.size() > k) {
				h1.put(nums[l], h1.get(nums[l]) - 1);
				if (h1.get(nums[l]) == 0) {
					h1.remove(nums[l]);
				}
				l++;
			}

			  ans+= r-l+1;;
		}
		return ans;
	}

	public static int subarraysWithKDistinct(int[] nums, int k) {
		return atMostK(nums, k) - atMostK(nums, k-1);
	}




	//	Main
	public static void main(String[] args) {
		int nums1[] = {1, 2, 1, 2, 3};
		int k1 = 2;
		System.out.println(subarraysWithKDistinct(nums1, k1));

	}
}	
