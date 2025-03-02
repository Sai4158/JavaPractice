package a_DSA_leetcode;

import java.util.Arrays;

public class _3467_Transform_Array_by_Parity {

	public static int[] transformArray(int[] nums) {

		int  n = nums.length;
		int l = 0;
		int r = n-1;
		int ans[] = new int[n];  


		while(l <= r) {

			if(nums[l] % 2 == 0) {
				ans[l] = 0; 
			} else {
				ans[l] = 1; 
			}
			l++; 
		}

		Arrays.sort(ans); 

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {4, 3, 2, 1};
		System.out.println(Arrays.toString(transformArray(nums))); 
	}
}	
