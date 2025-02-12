package a_DSA_leetcode;

public class _3191_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I {
	
    public static int minOperations(int[] nums) {
        
    	int n = nums.length;
    	int l = 0;
    	int ans = 0;
    	
    	for (int r = 0; r < n; r++) {
			
    		if(nums[r] == 0) {
    			
    			if(r+2 >= n) {
    				return -1;
    			}
    			
    			nums[r] ^= 1;
    			nums[r+1] ^= 1;
    			nums[r+2] ^= 1;
    			
    			ans++;
    		}
    		
		}
    	return ans;
    	
    }
	
	public static void main(String[] args) {
		int nums[] = {0,1,1,1,0,0};
		System.out.println(minOperations(nums));
	}
}
