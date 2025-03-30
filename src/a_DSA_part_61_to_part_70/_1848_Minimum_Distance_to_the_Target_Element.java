package a_DSA_part_61_to_part_70;

public class _1848_Minimum_Distance_to_the_Target_Element {


	public static int getMinDistance(int[] nums, int target, int start) {

		int n  =  nums.length;

		int min =  Integer.MAX_VALUE;


		for (int i = 0; i < nums.length; i++) {


			if(nums[i]==target) {
				min = Math.min(min, Math.abs(i - start));
			}
		}

		return min;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		int target = 5;
		int start = 3;

		System.out.println(getMinDistance(nums, target, start));
	}
}
