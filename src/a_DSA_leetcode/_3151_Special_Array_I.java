package a_DSA_leetcode;

public class _3151_Special_Array_I {
	
    public static boolean isArraySpecial(int[] nums) {
        
    	int n = nums.length;
    	
    	for (int i = 0; i < nums.length-1; i++) {
			
    		if(nums[i] % 2 == 1 && nums[i+1] % 2 == 1 || nums[i] % 2 == 0 && nums[i+1] % 2 == 0) {
    			return false;
    		}
    		
		}
    	return true;
    }
	
	public static void main(String[] args) {
		int nums[] = {2,1,4};
		System.out.println(isArraySpecial(nums));
	}
}
