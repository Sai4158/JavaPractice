package a_DSA_part_61_to_part_70;

public class Day66_CountPairs {
	
	public static int countPartitions(int[] nums) {
	
		int n  =  nums.length;
		int count = 0;
		
		for (int i = 0; i < n-1; i++) {
			
			int left = 0;
			int right = 0;
			
			for (int j = 0; j < i; j++) {
				left += nums[i];
			}
			
			for (int j = i + 1; j < n; j++) {
				right += nums[i];
			}
			
			
			
			if((left - right) % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {

		int nums[] = {10,10,3,7,6};
		System.out.println(countPartitions(nums));
	}
}
