package a_DSA_part_41_to_part_50;


public class Day41MaxSubArray {
	
    public  static int maxSubArray(int[] nums) {
    	
    	int l = Integer.MAX_VALUE;
    	int ans = 0;
    	int temp = 0;
    	int n = nums.length;
    	
    	for (int r = 0; r < n; r++) {
			
    		temp += nums[r];
    		
    		ans = Math.max(ans, temp);
    		
    		if(temp <0) {
    			temp++;
    			l = r + 1;
    			
    		}
    		
    		 
		}
    	return ans;
    	
    }

	
	public static void main(String[] args) {
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(nums));
	}
}
