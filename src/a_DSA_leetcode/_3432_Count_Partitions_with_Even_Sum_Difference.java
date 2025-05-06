package a_DSA_leetcode;

public class _3432_Count_Partitions_with_Even_Sum_Difference {


	public static int countPartitions(int[] nums) {


		int n = nums.length;
		int count =0;
		
		for (int i = 0; i < n-1; i++) {

			int left = 0;
			int right = 0;

			for (int j = 0; j <= i; j++) {
				left += nums[j];
			}
			
			for (int j = i+1; j < n; j++) {
				right += nums[j];
			}
		
		
			if((left - right) % 2 == 0 ) {
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
