package a_DSA_part_41_to_part_50;

public class Day39_2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer {
	
    public static int maximumCount(int[] nums) {
    	
    	int l = 0;
    	int n =  nums.length;
    	int r =  n-1;
    	
    	
    	while(l<r) {
    		
    		int mid = l +(r-l)/2;
    		
    		if(nums[mid] < 0) {
    			l =  mid + 1;
    		}else {
    			r =  mid -1;
    		}
    	}
    	
    	
    	int ncount = l;
    	int pcount = n - l;
    	
    	return Math.max(ncount, pcount);
    	
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {-2,-1,-1,1,2,3};
    	
    	System.out.println(maximumCount(nums));
	}
}
