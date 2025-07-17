package a_DSA_leetcode;

public class _908_Smallest_Range_I {

    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        
        // Find the actual min and max in the array
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        
        int diff = max - min;
        int reduced = diff - 2 * k;
        
        // If reduced is less than 0, return 0
        return Math.max(0, reduced);
    }


	public static void main(String[] args) {
		int[] nums = {1, 3, 6};
		int k = 3;
		System.out.println(smallestRangeI(nums, k));
	}
}
