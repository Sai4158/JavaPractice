package a_DSA_leetcode;

public class _2460_Apply_Operations_to_an_Array {

	public static int[] applyOperations(int[] nums) {

		int n =  nums.length;

		int ans[] =  new int[n];

		for (int i = 0; i < n-1; i++) {

			if(nums[i] == nums[i + 1]) {   		
				nums[i] = nums[i] * 2;
				nums[i+1] = 0;	
			}
		}

		int index = 0;

		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				ans[index++] = nums[i];
			}
		}


		return ans;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,2,1,1,0};
		System.out.println(applyOperations(nums));
	}
}
