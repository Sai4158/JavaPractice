package a_DSA_leetcode;import java.lang.module.FindException;

public class _2903_Find_Indices_With_Index_and_Value_Difference_I {

	public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {

		int  n =  nums.length;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if(Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
					return new int[] {i,j};
				}

			}

		}

        return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		int  nums[] = {5,1,4,1}, indexDifference = 2, valueDifference = 4;
		System.out.println(findIndices(nums, indexDifference, valueDifference));
	}
}
