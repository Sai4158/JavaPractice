package a_DSA_part_71_to_part_80;

public class Day74_SemiOrderedPermutation {

	public static int semiOrderedPermutation(int[] nums) {
		
		int n = nums.length;
		int pos1 = 0;
		int posn = 0;
		
		
		for (int i = 0; i < n; i++) {
			
			if(nums[i] ==  1) {
				pos1 =  i;
			}
			
			if(nums[i] ==  n) {
				posn =  i;
			}
			
		}
		
		if(pos1 <  posn) {
			return pos1 + (n - 1 - posn);
		}
		
		else {
			
			return pos1 + (n - 1 - posn) -  1;
		}
		
	}
	
	public static void main(String[] args) {
		
		int nums[] = {2,1,4,3};
		System.out.println(semiOrderedPermutation(nums));
	}
}
