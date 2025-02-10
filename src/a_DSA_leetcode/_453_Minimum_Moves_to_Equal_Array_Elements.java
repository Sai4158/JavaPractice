package a_DSA_leetcode;

import java.util.Arrays;

public class _453_Minimum_Moves_to_Equal_Array_Elements {

    public static int minMoves(int[] nums) {
        
    	int n = nums.length;
    	int count = 0;
    	Arrays.sort(nums);
    	
    	int min =  nums[0];
    	
    	for (int i = 0; i < n; i++) {
			
    		count+=  nums[i] - min;
    		
    		
		}
    	return count;
    	
    	
    }
	
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3};
		System.out.println(minMoves(nums));
	
	}
}
