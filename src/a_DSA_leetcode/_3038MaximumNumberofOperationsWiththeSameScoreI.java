package a_DSA_leetcode;

public class _3038MaximumNumberofOperationsWiththeSameScoreI {
    public static int maxOperations(int[] nums) {
        
    	int n = nums.length;
    	int count = 0;
    	
    	if(n < 2) {
    		return 0;
    	}
    	
    	int ans =   nums[0] + nums[1];
    	 
    	for (int i = 0; i < n-1; i+=2) {
			
    		int sum = nums[i] + nums[i+1];
    		
    		if(sum == ans) {
    			count++;
    		}
    		else {
    			break;
    		}
    		
    		
		}
    	return count;
    }
    
    public static void main(String[] args) {
		int nums[] = {3,2,1,4,5};
		System.out.println(maxOperations(nums));
	}
}
