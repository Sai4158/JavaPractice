package a_DSA_leetcode;

public class _2367_Number_of_Arithmetic_Triplets {
	
    public static int arithmeticTriplets(int[] nums, int diff) {
        
    	int n =  nums.length;
    	int count = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		for (int j = 0; j < nums.length; j++) {
				
    			
    			for (int k = 0; k < nums.length; k++) {
					
    				
    				if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
    					count++;
    				}
    				
				}
    			
			}
    		
		}
    	
    	return count;
    	
    }
	
	public static void main(String[] args) {
		int nums[] = {0,1,4,6,7,10}, diff = 3;
		System.out.println(arithmeticTriplets(nums, diff));
		
	}
}
