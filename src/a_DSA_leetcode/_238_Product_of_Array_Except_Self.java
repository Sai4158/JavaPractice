package a_DSA_leetcode;

import java.util.Iterator;

public class _238_Product_of_Array_Except_Self {
	
	public static int[] productExceptSelf(int[] nums) {
        int n =  nums.length;
        int ans[] = new int[n];
    
        int prefix =1;
        for (int i = 0; i < n; i++) {
        	 ans[i] = prefix;
             prefix *= nums[i]; 
		}
        
        int suffix =1;
        for (int i = n-1; i >=0; i--) {
        	 ans[i] *= suffix;
             suffix *= nums[i]; 
		}
        return ans;
        
    }
    
	
	public static void main(String[] args) {
		int nums[] =  {1,2,3,4};
		
		System.out.println(productExceptSelf(nums));
	}
}
