package a_DSA_part_41_to_part_50;


public class Day41MaxSubArray {
	
    public static int maxProduct(int[] nums) {
    	
    	int n =  nums.length;
    	int ans  = Integer.MIN_VALUE;
    	
    	for (int i = 0; i < n; i++) {
			int product = 1;
			
			for (int j = i; j < n; j++) {
				product *= nums[j];

				ans =  Math.max(ans, product);
			}
			
		}
    	return ans;
    	
    }

	
	public static void main(String[] args) {
		
		int nums[] = {2,3,-2,4};
		
		System.out.println(maxProduct(nums));
	}
}
