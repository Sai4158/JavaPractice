package a_DSA_leetcode;

public class _45_Jump_Game_II {

	 public static int jump(int[] nums) {
	        
	        int n = nums.length;
	        
	        if (n <= 1) {
	            return 0;
	        }
	        
	        int count = 0;
	        int current = 0;
	        int far = 0;
	        
	        for (int i = 0; i < n - 1; i++) {
	            far = Math.max(far, i + nums[i]);
	            
	            if (i == current) {
	                count++;
	                current = far;
	                
	                if (current >= n - 1) {
	                    break;
	                }
	            }
	        }
	        
	        return count;
	    }
    
    public static void main(String[] args) {
		
    	
    	int nums[] = {2,3,1,1,4};
    	
    	System.out.println(jump(nums));
    	
	}
	
}
