package a_DSA_leetcode;

import java.util.HashMap;

public class _3024_Type_of_Triangle_ {

	public static String triangleType(int[] nums) {

		int n  =  nums.length;

		HashMap<Integer, Integer> h1  = new HashMap<Integer, Integer>();

		if (nums.length != 3) {
            return "none";
        }

        // Check if the sides satisfy the triangle 
        if (nums[0] + nums[1] <= nums[2] || 
            nums[0] + nums[2] <= nums[1] || 
            nums[1] + nums[2] <= nums[0]) {
            return "none"; 
        }

		for (int i = 0; i < n; i++) {
			h1.put(nums[i], h1.getOrDefault(nums[i], 0)+1);	
		}
		

		if(h1.size() == 1) {
			return "equilateral";
		} else if (h1.size() == 2) {
			return "isosceles";
		}else {
			return "scalene"; 
		}

	}


	public static void main(String[] args) {
		int nums[] = {3,3,3};

		System.out.println(triangleType(nums));
	}
}
