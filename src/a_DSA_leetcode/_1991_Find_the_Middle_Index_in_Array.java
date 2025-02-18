package a_DSA_leetcode;

public class _1991_Find_the_Middle_Index_in_Array {
	
    public static int findMiddleIndex(int[] nums) {
        
    	int n =  nums.length;
    	int left = 0;
    	int total = 0;
    	
    	for (int i = 0; i < n; i++) {
    		total += nums[i];
		}
    	
    	for (int i = 0; i < n; i++) {
			
    		int right =  total - left - nums[i];
    		
    		if(left == right) {
    			return i;
    		}
    		
    		left += nums[i];
		}
    	
    	return -1;
    }
	
	public static void main(String[] args) {
		int nums[] = {2,3,-1,8,4};
		
    	System.out.println(findMiddleIndex(nums));
	}
}
