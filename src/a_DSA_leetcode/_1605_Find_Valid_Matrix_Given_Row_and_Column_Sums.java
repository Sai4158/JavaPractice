package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _1605_Find_Valid_Matrix_Given_Row_and_Column_Sums {

	public static List<List<Integer>> findMatrix(int[] nums) {

		int n = nums.length;
		HashMap<Integer, Integer> freq = new HashMap<>();
		List<List<Integer>> ans =  new 	ArrayList<List<Integer>>();
		
		for (int i = 0; i < n; i++) {
			int count = freq.getOrDefault(nums[i], 0);

			if (ans.size() <= count) {
				ans.add(new ArrayList<>());
			}

			ans.get(count).add(nums[i]);

			freq.put(nums[i], count + 1);
		}

		return ans;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 1, 2, 3, 1};
		System.out.println(findMatrix(nums));
	}
}
