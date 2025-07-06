package a_DSA_leetcode;

import java.util.concurrent.CountDownLatch;


public class _1909_Remove_One_Element_to_Make_the_Array_Strictly_Increasing {


	public static boolean canBeIncreasing(int[] nums) {

		int n = nums.length;


		for (int i = 0; i < n-1; i++) {

			int prev =  -1;
			boolean isValid =  true;

			for (int j = 0; j < n; j++) {

				if(j == i) {
					continue;
				}

				if (nums[j] <= prev) {
					isValid = false;
					break;
				}
				prev = nums[j];


			}
			
			if(isValid)return true;

		}

		return false;
	}


	public static void main(String[] args) {
		System.out.println(canBeIncreasing(new int[]{1, 2, 10, 5, 7}));
	}
}
