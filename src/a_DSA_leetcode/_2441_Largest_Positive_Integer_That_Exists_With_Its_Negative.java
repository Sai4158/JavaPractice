package a_DSA_leetcode;

public class _2441_Largest_Positive_Integer_That_Exists_With_Its_Negative {
	
	public static int findMaxK(int[] nums) {
	    int max = -1;


	    for (int i = 0; i < nums.length; i++) {
			
	    	
	    	for (int j = 0; j < nums.length; j++) {
				
	    		
	    		if(nums[i] == -nums[j]) {
	    			max = Math.max(max, Math.abs(nums[i]));
	    		}
	    		
			}
	    	
		}
	    
	    return max;
	}

	
	public static void main(String[] args) {
		
		int nums[] = {-1,2,-3,3};
		
		System.out.println(findMaxK(nums));
		
	}
}
