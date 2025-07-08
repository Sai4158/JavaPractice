package a_DSA_leetcode;

public class _2778_Sum_of_Squares_of_Special_Elements {
	
    public static int sumOfSquares(int[] nums) {
        
    	int n = nums.length;
    	
    	int total = 0;
    	
    	for (int i = 1; i <= n; i++) {
			
    		if(n % i == 0) {
    			
    			int val =  nums[i-1];
    			
    			total += val * val;
    			
    		}
    		
		}
    	
    	
    	return total;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4};
		System.out.println(sumOfSquares(nums));
		
	}
}
