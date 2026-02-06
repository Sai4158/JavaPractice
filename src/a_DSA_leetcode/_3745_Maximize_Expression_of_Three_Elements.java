package a_DSA_leetcode;

import java.util.Arrays;

public class _3745_Maximize_Expression_of_Three_Elements {

    public static int maximizeExpressionOfThree(int[] nums) {
        
    	int n =  nums.length;
    	
        // sort the array in increasing order
    	Arrays.sort(nums);
    	
    	// choose the largest number as a
        int a = nums[n - 1];

        // choose the second largest number as b
        int b = nums[n - 2];

        // choose the smallest number as c (because we subtract c)
        int c = nums[0];

        // maximize a + b - c
        int ans = a + b - c;

        // return the maximum value
        return ans;
    }
    
    
    public static void main(String[] args) {
		
    	int nums[] = {1,4,2,5};
    	
    	System.out.println(maximizeExpressionOfThree(nums));
    	
	}
	
}
