package a_DSA_leetcode;

import java.util.Arrays;

public class _2099_Find_Subsequence_of_Length_K_With_the_Largest_Sum {
	
    public static int[] maxSubsequence(int[] nums, int k) {
        
//    	Nums length
    	int  n = nums.length;
    	
//    	Array copy
    	Integer[] idx = new Integer[n];
    	

    	for (int i = 0; i < n; i++) {
    		idx[i] = i;
		}
    	
//    	Sorting 
        Arrays.sort(idx, (a, b) -> Integer.compare(nums[a], nums[b]));

        Integer[] pick = Arrays.copyOfRange(idx, n - k, n);
        
        Arrays.sort(pick);

        
        int[] ans = new int[k];
        for(int i = 0; i<k; i++) {
        	ans[i] =  nums[pick[i]];
        }
        
        return ans;
    
    }
    
}

