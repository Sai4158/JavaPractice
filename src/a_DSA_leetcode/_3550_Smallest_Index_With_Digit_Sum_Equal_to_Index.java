package a_DSA_leetcode;

import java.util.ArrayList;


public class _3550_Smallest_Index_With_Digit_Sum_Equal_to_Index {
	
    public static int smallestIndex(int[] nums) {
        
    	int n = nums.length;
    	    	
    	for (int i = 0; i < n; i++) {
			
    		int sum = 0 ;
    		int x = nums[i];
    		
    		
    		while(x > 0) {
    			sum += x % 10;
    			x /= 10;
    		}
    		
    		
    		if(sum == i) {
    			return i;
    		}
    		
		}
    	
    	return -1;
    	
    }
	
	public static void main(String[] args) {
		
		int  nums[] = {1,3,2};
		System.out.println(smallestIndex(nums));
		
	}
	
}
