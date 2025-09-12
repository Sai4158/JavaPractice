package a_DSA_leetcode;

public class _3452_Sum_of_Good_Numbers {

    public static int sumOfGoodNumbers(int[] nums, int k) {
        
    	int n = nums.length;
    	
    	int count = 0 ;
    	
    	for (int i = 0; i < n; i++) {
			
    		boolean good  = true;
    		
    		
    		if (i - k >= 0 && nums[i] <= nums[i - k]) {
                good = false;
            }

            if (i + k < n && nums[i] <= nums[i + k]) {
                good = false;
            }

            if (good) {
                count += nums[i];
            }
    		
		}
    	
    	
    	return count;
    	
    }
    
    public static void main(String[] args) {
		
    	int  nums[] = {1,3,2,1,5,4}, k = 2;
    	
    	System.out.println(sumOfGoodNumbers(nums, k));
	}
	
}
