package a_DSA_leetcode;

public class _2683_Neighboring_Bitwise_XOR {

	public static boolean doesValidArrayExist(int[] derived) {

		int n =  derived.length;


		int ans = 0;

		for (int i = 0; i < n; i++) {

			ans ^= derived[i];

		}

		return ans == 0;


	}


	public static void main(String[] args) {
		int nums[] = {1,1,0};
		System.out.println(doesValidArrayExist(nums));
	}
}
