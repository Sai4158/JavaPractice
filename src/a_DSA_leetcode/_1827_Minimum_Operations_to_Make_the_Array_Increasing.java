package a_DSA_leetcode;

public class _1827_Minimum_Operations_to_Make_the_Array_Increasing {
	
    public static int minOperations(int[] nums) {
        
    	int count = 0;
    	
    	for (int i = 0; i < nums.length-1; i++) {
			
    		if(nums[i] > nums[i+1]) {
    			
                int diff = nums[i] - nums[i + 1] + 1;
    			
    			count += diff;
    			
    			
    			nums[i+1] += diff;
    		}
    		
		}
    	return count;
    }
	
	public static void main(String[] args) {
	    int[] nums = {1, 5, 2, 4, 1};
        System.out.println(minOperations(nums));
	}
}
