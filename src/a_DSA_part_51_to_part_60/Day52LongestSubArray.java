package a_DSA_part_51_to_part_60;

public class Day52LongestSubArray {

    public static int longestSubarray(int[] nums, int k) {
    	
    	int temp = 0;
    	int ans = 0;
    	
    	int l = 0;
    	
    	for (int r = 0; r < nums.length; r++) {
			
    		if(nums[r] == 0) {
    			temp++;
    		}
    		
    		while(temp > k) {
    			if(nums[l] == 0) {
        			temp--;
        		}
    			
    			l++;
    		}
    		
    		ans = Math.max(ans, r-l+1);
		}
    return ans;
    }
   
    
	
	public static void main(String[] args) {
		int nums[] = {1,0,1,1};
		int k =0;
		System.out.println(longestSubarray(nums, k));
	}
}
