package a_DSA_leetcode;

import java.util.Arrays;

public class _976_Largest_Perimeter_Triangle {

    public static int largestPerimeter(int[] nums) {
        
    	int n =  nums.length;
    	Arrays.sort(nums);
 
    	
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i - 2], b = nums[i - 1], c = nums[i];

    		if(a+b>c) {
    			return a + b +c;
    					
    		}
    		
    		
		}
    	return 0;
    }
}
