package a_DSA_leetcode;

import java.util.Arrays;

public class _1979_Find_Greatest_Common_Divisor_of_Array {


	public static int findGCD(int[] nums) {

		int n =  nums.length;
		Arrays.sort(nums);
		int ans = 1; 
		int min =  nums[0];
		int max = nums[n-1];



		for (int i = 1; i <= min; i++) {  
			if (min % i == 0 && max % i == 0) {
				ans = i;  
			}
		}


		return ans;
	}

	public static void main(String[] args) {

		int nums[] = {2,5,6,9,10};
		System.out.println(findGCD(nums));
	}
}
