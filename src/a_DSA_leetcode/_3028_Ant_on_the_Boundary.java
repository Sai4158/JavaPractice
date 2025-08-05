package a_DSA_leetcode;

public class _3028_Ant_on_the_Boundary {
	
	
    public static int returnToBoundaryCount(int[] nums) {
        
    	int n = nums.length;
    	
    	int count = 0;
    	int pos = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		pos +=  nums[i];
    		
    		if(pos == 0) {
    			count++;
    		}
    		
		}
    	
    	
    	return count;
    }
	
	public static void main(String[] args) {
		int nums[] = {2,3,-5};
		System.out.println(returnToBoundaryCount(nums));
				
	}
}
