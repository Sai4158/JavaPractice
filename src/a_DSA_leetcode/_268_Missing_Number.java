package a_DSA_leetcode;

import java.util.Arrays;

public class _268_Missing_Number {
	
	
	 public static int missingNumber(int[] nums) {
		 
		 int n = nums.length;
		 
		 Arrays.sort(nums);
		 
		 for (int i = 0; i < n; i++) {
			
			 if(nums[i] != i) {
				 return i;
			 }
			 
		}
		 return n;
		 
	 }
	
	public static void main(String[] args) {
		 int[] nums1 = {3, 0, 1};
		 System.out.println(missingNumber(nums1));
	}
}
