package a_DSA_leetcode;

public class _1493_Longest_Subarray_of_1s_After_Deleting_One_Element {
	
    public static int longestSubarray(int[] nums) {
        
    	int l = 0;
    	int ans = 0;
    	int temp = 0;
    	
    	
        for (int r = 0; r < nums.length; r++) {
			
    		if(nums[r] == 0) {
    			temp++;
    		}
    		
    		while(temp > 1) {
    			if(nums[l] == 0) {
        			temp--;
        		}
    			
    			l++;
    		}
    		
    		ans = Math.max(ans, r-l);
		}
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,0,1,1};
		System.out.println(longestSubarray(nums));
		
	}
}
