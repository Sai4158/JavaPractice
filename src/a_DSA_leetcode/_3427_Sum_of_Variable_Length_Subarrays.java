package a_DSA_leetcode;

public class _3427_Sum_of_Variable_Length_Subarrays {

    public static int subarraySum(int[] nums) {
        
    	int n =  nums.length;
    	int ans = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		int start = Math.max(0, i-nums[i]);
    		
    		for (int j = start; j <=i; j++) {
				
    			ans += nums[j];
			}
    		
		}
    	
    	return ans;
    	
    }
	
	public static void main(String[] args) {
		
		int nums[] = {2,3,1};
		System.out.println(subarraySum(nums));
	}
}
