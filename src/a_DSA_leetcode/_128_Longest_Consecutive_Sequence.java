package a_DSA_leetcode;

import java.util.Arrays;

public class _128_Longest_Consecutive_Sequence {

    public static int longestConsecutive(int[] nums) {
        
    	
    	Arrays.sort(nums);
    	
    	int  n =  nums.length;
    	
    	if(n == 0) {
    		return 0;
    	}
    	
    	int longest = 1;
    	int current = 1;
    	
    	
    	
    	 for (int i = 1; i < n; i++) {

             if (nums[i] == nums[i - 1]) {
                 continue;
             } else if (nums[i] == nums[i - 1] + 1) {
                 current++;
             } else {
                 current = 1;
             }

             if (current > longest) {
                 longest = current;
             }
         }
    	
    	
    	return longest;
    }
    
    public static void main(String[] args) {
		
	}
	
}
