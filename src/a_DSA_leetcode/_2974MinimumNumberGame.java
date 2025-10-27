package a_DSA_leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class _2974MinimumNumberGame {

    public static int[] numberGame(int[] nums) {
        
    	int n =  nums.length;
    	Arrays.sort(nums);
    	
    	int[] ans =  new int[n];
    	
    	int bob = 0;
    	int alice = 0;
    	
    	for (int i = 0; i < n-1; i+=2) {
			
    		bob =  nums[i];
    		alice =  nums[i+1];
    		
    		
    		ans[i] =  alice;
    		ans[i+1] = bob;
    		
		}
    	
    	return ans;
    	
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {5,4,2,3};
    	System.out.println(numberGame(nums));
    	
	}
	
}
