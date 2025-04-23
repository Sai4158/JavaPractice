package a_DSA_leetcode;

import java.util.Arrays;

public class _2733_Neither_Minimum_nor_Maximum {
	
    public static int findNonMinOrMax(int[] nums) {
        
    	int n = nums.length;
    	
    	if(n < 2) {
    		return -1;
    	}
    	
        Arrays.sort(nums);

    	return nums[n/2];
    }
	
	public static void main(String[] args) {
	
		int nums[] = {3,2,1,4};
		System.out.println(findNonMinOrMax(nums));
	}
}
