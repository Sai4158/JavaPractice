package a_DSA_leetcode;

public class _2006_Count_Number_of_Pairs_With_Absolute_Difference_K {
	
    public static int countKDifference(int[] nums, int k) {
        
    	int n =  nums.length;
    	int count = 0;
    	
    	
    	for (int i = 0; i < n; i++) {
			
    		for (int j = 0; j < n; j++) {
				
    				if(nums[i] - nums[j] == k) {
    					count++;
    				}
    			
    			
			}
    		
		}
    	
    	return count;
    	
    }
	
	public static void main(String[] args) {
		int  nums[] = {1,2,2,1}, k = 1;
		
		System.out.println(countKDifference(nums, k));
	}
}
