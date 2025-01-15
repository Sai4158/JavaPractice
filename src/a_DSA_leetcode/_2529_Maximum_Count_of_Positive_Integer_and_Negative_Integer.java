package a_DSA_leetcode;

public class _2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer {

	
    public static int maximumCount(int[] nums) {
        
    	int n = nums.length;
    	int ncount =0;
    	int pcount =0;
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		if(nums[i] < 0){
    			ncount++;
    		}else if (nums[i] > 0){
    			pcount++;
    		}
    		
		}
    	
    	return Math.max(ncount, pcount);
    }
	
	public static void main(String[] args) {
		int nums[] = {-2,-1,-1,1,2,3};
		System.out.println(maximumCount(nums));
	}
}
