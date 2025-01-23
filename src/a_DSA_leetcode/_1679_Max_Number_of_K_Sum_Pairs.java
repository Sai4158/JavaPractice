package a_DSA_leetcode;

import java.util.Arrays;

public class _1679_Max_Number_of_K_Sum_Pairs {
	
	
    public static int maxOperations(int[] nums, int k) {
        
    	Arrays.sort(nums);
    	int count = 0;
    	int n =  nums.length;
    	int l = 0;
    	int r = n-1;
    	
    	while(l<r) {
    		
    		if(nums[l] + nums[r] == k) {
    			count++;
    			l++;
    			r--;
    		}else if(nums[l] + nums[r] < k) {
    			l++;
    		}else {
    			r--;
    		}
    	}
    	
    	return count;
    	
    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4};
		
		int k = 5;
		
		System.out.println(maxOperations(nums, k));
		
	}
}
