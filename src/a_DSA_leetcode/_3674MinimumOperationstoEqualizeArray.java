package a_DSA_leetcode;


public class _3674MinimumOperationstoEqualizeArray {

	public static int minOperations(int[] nums) {

		int  n =  nums.length;
	
		boolean check = true;
		
		for (int i = 0; i < n-1; i++) {
		
			if(nums[i] != nums[i+1]) {
				check = false;
			}
				
		}
		
		if(check) {
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {

	}
}
