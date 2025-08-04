package a_DSA_leetcode;

public class _2317_Maximum_XOR_After_Operations_ {

	public static int maximumXOR(int[] nums) {
		
		int ans = 0;
		
		
		for (int i = 0; i < nums.length; i++) {
		
			ans |= nums[i];
			
			
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		int nums[] = {3,2,4,6};

		System.out.println(maximumXOR(nums));
	}
}
