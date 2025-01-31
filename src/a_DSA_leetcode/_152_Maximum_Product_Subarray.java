package a_DSA_leetcode;

public class _152_Maximum_Product_Subarray {
	
	
    public static int maxProduct(int[] nums) {
    	
    	int l = 0;
    	int temp = 1;
    	int ans = 0;
    	int n = nums.length;
    	
    	for (int r = 0; r < n; r++) {
			
    		temp *= nums[r];
    		
    		ans = Math.max(ans, r=l-1);
    		
    		if(temp < 0) {
    			temp
    		}
		}
    	
    	
    }
	
	public static void main(String[] args) {
			
		int nums[] = {2,3,-2,4};
		
		System.out.println(maxProduct(nums));
	}
}
