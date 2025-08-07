package a_DSA_leetcode;

public class _2475_Number_of_Unequal_Triplets_in_Array {

	public static int unequalTriplets(int[] nums) {

		int n =  nums.length;
		int count = 0;
		
		for (int i = 0; i < n -2 ; i++) {

			for (int j = i+1; j < n -1; j++) {

				for (int k = j; k < n; k++) {

					if(nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
						
						count++;
						
					}
					
				}

			}

		}
		
		return count;

	}


	public static void main(String[] args) {
		
		int nums[] = {4,4,2,4,3};
		System.out.println(unequalTriplets(nums));
	}
}
