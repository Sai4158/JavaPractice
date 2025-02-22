package a_DSA_leetcode;

import java.util.Arrays;

public class _611_Valid_Triangle_Number {
	
	  public static int triangleNumber(int[] nums) {
	        int n = nums.length;
	        int count = 0;

	        Arrays.sort(nums); 
	        
	        for (int i = n - 1; i >= 2; i--) {
	            for (int j = i - 1; j >= 1; j--) {
	                for (int k = j - 1; k >= 0; k--) {
	                    if (nums[k] + nums[j] > nums[i]) {
	                        count++;
	                    } else {
	                        break; 
	                    }
	                }
	            }
	        }

	        return count;
	    }

	public static void main(String[] args) {
		
		int nums[] = {2,2,3,4};
		System.out.println(triangleNumber(nums));
	}
}
