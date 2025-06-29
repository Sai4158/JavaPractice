package a_DSA_leetcode;

import java.util.Arrays;

public class _2740_Find_the_Value_of_the_Partition {

    public static int findValueOfPartition(int[] nums) {
        
    	int n = nums.length;
    	
    	Arrays.sort(nums);
    	
    	int count = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < n-1; i++) {
			int check  = Math.abs(nums[i] - nums[i+1]);
			

			count = Math.min(check, count);
		}
    	return count;
    }
	
	public static void main(String[] args) {
		int nums[] = {1,3,2,4};
		System.out.println(findValueOfPartition(nums));
		
	}
}
