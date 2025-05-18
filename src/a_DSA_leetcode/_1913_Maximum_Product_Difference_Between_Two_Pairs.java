package a_DSA_leetcode;

import java.util.Arrays;

public class _1913_Maximum_Product_Difference_Between_Two_Pairs {

	public static int maxProductDifference(int[] nums) {

		Arrays.sort(nums);
		int n = nums.length;

//		Two largest 
		int max1 = nums[n - 1];     
		int max2 = nums[n - 2];     
		
//		Two min
		int min1 = nums[0];         
		int min2 = nums[1];         

//		Cal the diffrence
		int diff = (max1 * max2) - (min1 * min2);
		
		
		return diff;
	}

	public static void main(String[] args) {
		int  nums[] = {5,6,2,7,4};
		System.out.println(maxProductDifference(nums));
	}
}
