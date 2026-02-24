package a_DSA_leetcode;

public class _Max_Consecutive_Ones {

    public static int findMaxConsecutiveOnes(int[] nums) {
     
    	int n = nums.length;
    	
    	int count = 0;
    	int max = 0;
    	
    	for (int i = 0; i < n; i++) {
			

    		
    		if(nums[i] ==  1) {
    			count++;
    			max = Math.max(max, count);
    		}else {
    			count=0;
    		}
    		
		}
    	return max;
    }
    
    public static void main(String[] args) {
		
    	int nums[] = {1,1,0,1,1,1};
    	System.out.println(findMaxConsecutiveOnes(nums));
    	
	}
	
}
