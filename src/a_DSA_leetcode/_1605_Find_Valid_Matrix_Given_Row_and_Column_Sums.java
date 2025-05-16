package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _1605_Find_Valid_Matrix_Given_Row_and_Column_Sums {

	public static List<List<Integer>> findMatrix(int[] nums) {

//		Len of the array
		int n = nums.length;
		
//		HashMap
		HashMap<Integer, Integer> freq = new HashMap<>();
		
//		List 
		List<List<Integer>> ans =  new 	ArrayList<List<Integer>>();
		
//		forLoop
		for (int i = 0; i < n; i++) {
//			Count the freq of the numbers
			int count = freq.getOrDefault(nums[i], 0);

//			if the list size does not match the size of the count  - make a new arrayList to seprate
			if (ans.size() <= count) {
				ans.add(new ArrayList<>());
			}

			ans.get(count).add(nums[i]);
			freq.put(nums[i], count + 1);
		}

//		Return the ans
		return ans;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 1, 2, 3, 1};
		System.out.println(findMatrix(nums));
	}
}
