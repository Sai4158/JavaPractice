package a_DSA_leetcode;

public class _2023_Number_of_Pairs_of_Strings_With_Concatenation_Equal_to_Target {

	public static int numOfPairs(String[] nums, String target) {

		int n =  nums.length;

		String combined  = "";

		int count = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if(i != j) {
					combined = nums[i] + nums[j];

					if(combined.equals(target)) {

						count ++;
					}

				}
			}

		}
		return count;
	}

	public static void main(String[] args) {
		String nums[] = {"777","7","77","77"}, target = "7777";
		System.out.println(numOfPairs(nums, target));	
	}
}
