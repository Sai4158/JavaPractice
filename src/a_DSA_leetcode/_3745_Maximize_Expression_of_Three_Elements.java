package a_DSA_leetcode;

import java.util.Arrays;

public class _3745_Maximize_Expression_of_Three_Elements {

    public static int maximizeExpressionOfThree(int[] nums) {
        
    	int n =  nums.length;
    	
    	Arrays.sort(nums);
    	
    	int a = nums[n-1];
    	int b = nums[n-2];
    	int c =  nums[0];
    	
    	int ans = a + b - c;
    	
    	return ans;
    	
    }
    
    
    public static void main(String[] args) {
		
    	int nums[] = {1,4,2,5};
    	
    	System.out.println(maximizeExpressionOfThree(nums));
    	
	}
	
}
