package a_DSA_part_71_to_part_80;

public class Day80_AntontheBoundary {

	
    public static int returnToBoundaryCount(int[] nums) {

    	int n =  nums.length;
    	int pos = 0;
    	int count = 0;
    	
    	
    	for (int i = 0; i < n; i++) {
			
    		pos += nums[i];
    		
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
