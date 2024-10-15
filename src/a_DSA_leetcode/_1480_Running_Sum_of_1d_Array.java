package a_DSA_leetcode;

import java.util.Arrays;

public class _1480_Running_Sum_of_1d_Array {
	 public static int[] runningSum(int[] nums) {
	        
	        int n = nums.length;

	        for(int i =1;  i<n; i++){
	            // index 0 + index 1
	           nums[i] = nums[i-1] + nums[i];
	        }
	        
	        return nums;
	    }
	 
	 public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		
		System.out.println(Arrays.toString(runningSum(nums)));
	}
}
