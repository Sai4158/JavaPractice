package a_DSA_part_61_to_part_70;

public class Day65_LargestPositiveThatExistsItsNegative {
	
	public static int findMaxK(int[] nums) {

		int n = nums.length;
		int max = -1;
		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = 0; j < nums.length; j++) {
				
				int val1 = nums[i];
				int val2 =  -nums[j];
				
				if(val1 ==  val2) {
					
					max = Math.max(max, Math.abs(val2));
					
				}
				
			}
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {-1,2,-3,3};
		System.out.println(findMaxK(nums));
		
	}
}
