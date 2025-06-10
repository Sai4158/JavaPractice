package a_DSA_leetcode;

public class _1464_Maximum_Product_of_Two_Elements_in_an_Array {
	
    public static int maxProduct(int[] nums) {
        
    	int n = nums.length;
    	int ans =  Integer.MIN_VALUE;
    	
    	for (int i = 0; i < n; i++) {
			
    		for (int j = i+1; j < n; j++) {
				
    			if((nums[i]-1)*(nums[j]-1) > ans) {
    				ans = (nums[i]-1)*(nums[j]-1);
    			}

			}
    		
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		int nums[] = {3,4,5,2};
		System.out.println(maxProduct(nums));
	}
}
