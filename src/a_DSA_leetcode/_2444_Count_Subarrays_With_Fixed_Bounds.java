package a_DSA_leetcode;

public class _2444_Count_Subarrays_With_Fixed_Bounds {
	
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        
      	long ans = 0;
    	int mink = -1;
    	int maxk = -1;
    	int l = -1;
    	
    	for (int i = 0; i < nums.length; i++) {
			
//    		If this is out of range then update the window
    		
    		if (nums[i] < minK || nums[i] > maxK) {
    			l = i;
    		}
    		
//    		if it matches then update
    		if (nums[i] == minK) {
    			mink = i;
    		}
    			
    		if (nums[i] == maxK) {
    			maxk = i;
    		}
    		
    		
    		ans += Math.max(0, Math.min(mink, maxk) - l);
		}
    	
    	return ans;
    	
    }
	
	public static void main(String[] args) {
		int nums[] = {1,3,5,2,7,5}, minK = 1, maxK = 5;
		System.out.println(countSubarrays(nums, minK, maxK));
	}
}
