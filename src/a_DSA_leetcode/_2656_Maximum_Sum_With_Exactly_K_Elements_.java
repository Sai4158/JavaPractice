package a_DSA_leetcode;

import java.util.Arrays;

public class _2656_Maximum_Sum_With_Exactly_K_Elements_ {

    public static int maximizeSum(int[] nums, int k) {
        
    	int n =  nums.length;
    	
    	Arrays.sort(nums);
    	
    	int ans = nums[n-1];
    	
        return k * ans + (k * (k - 1)) / 2;
    	
    }
	
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5}, k = 3;
		System.out.println(maximizeSum(nums, k));
	}
}
