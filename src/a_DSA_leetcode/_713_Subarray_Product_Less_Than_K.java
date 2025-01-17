package a_DSA_leetcode;

public class _713_Subarray_Product_Less_Than_K {
    
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
    
        int ans = 0;
        int product = 1;
        int l = 0;
        
        if (k <= 1) return 0;
        
        for (int r = 0; r < nums.length; r++) {
        	product *= nums[r];
        	
        	while(product >= k) {
        		product /= nums[l];
        		l++;
        	}
        	
        	ans+= r - l+1;
		}
        
        return ans;
    	
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {10,5,2,6};
    	int k = 100;
    	
    	System.out.println(numSubarrayProductLessThanK(nums, k));
	}
}
