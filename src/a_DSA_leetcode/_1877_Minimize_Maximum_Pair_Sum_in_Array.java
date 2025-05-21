package a_DSA_leetcode;

import java.util.Arrays;

public class _1877_Minimize_Maximum_Pair_Sum_in_Array {
	
    public static int minPairSum(int[] nums) {
        
    	int n = nums.length;
    	int max = 0;
    	
    	Arrays.sort(nums);
    	
    	int l = 0;
    	int r = n-1;
    	
    	while(l<r) {
    		
    		int temp =  nums[l] + nums[r];
    		
    		max =  Math.max(max, temp);
    		
    		
    		l++;
    		r--;
    	}
    	return max;
    }
	
	public static void main(String[] args) {
		int nums[] = {3,5,2,3};
		System.out.println(minPairSum(nums));
	}
}
