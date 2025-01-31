package a_DSA_leetcode;

public class _53_Maximum_Subarray {
	
    public  int maxSubArray(int[] nums) {
        
    	int n =  nums.length;
    	int temp = 0;
    	int l = 0;
    	int ans = Integer.MIN_VALUE;
    	
    	for (int r = 0; r < n; r++) {
			
    		temp += nums[r];

    		ans = Math.max(ans, temp);

    		if(temp< 0) {
    			temp =0;
    			l =  r + 1;
    		}
    		
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		
		_53_Maximum_Subarray ab =  new _53_Maximum_Subarray();
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(ab.maxSubArray(nums));
	}
}
