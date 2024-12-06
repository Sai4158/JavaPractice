package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class _2974_Minimum_Number_Game_ {

	public static int[] numberGame(int[] nums) {

		int n=nums.length;
		int temp = 0;
		Arrays.sort(nums);

		for(int i=0;i<n;i+=2) {
			temp = nums[i];
			nums[i]= nums[i+1];
			nums[i+1]=temp;
		}
		
		
		return nums;

	}

	public static void main(String[] args) {

		int arr[] = {2,3,5,4};
		System.out.println(numberGame(arr));
	}
}
