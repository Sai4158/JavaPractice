package a_DSA_leetcode;

public class _2317_Maximum_XOR_After_Operations {

	
    public static int maximumXOR(int[] nums) {
        
    	int n =  nums.length;
    	
    	int ans = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		ans |= nums[i];
    		
		}
    	
    	return ans;
    	
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {3,2,4,6};
    	
    	System.out.println(maximumXOR(nums));
    	
	}
}
