package a_DSA_leetcode;

public class _1470_Shuffle_the_Array {

	public static int[] shuffle(int[] nums, int n) {

		int x = 0;
		int y = n;

		int ans[] = new int[2*n];

		for (int i = 0; i < 2*n; i++) {

			if(i % 2 == 0) {
				ans[i] = nums[x++];
			}else {
				ans[i] =  nums[y++];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = {2,5,1,3,4,7};
		int n = 3;
		System.out.println(shuffle(nums, n));
	}
}
