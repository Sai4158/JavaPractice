package a_DSA_leetcode;

public class _1304_Find_N_Unique_Integers_Sum_up_to_Zero {

	public static int[] sumZero(int n) {

		int ans[] = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {

			// For the first n-1 positions, fill with 1,2,3,...,n-1

			if(i < n - 1) {
				ans[i] =  i + 1;
				sum += ans[i];

				// On the last position, put the negative of the running sum
				// This makes the total of all elements = 0
			}else {
				ans[i] =  -sum;
			}
		}

		return ans;

	}


	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumZero(n));
	}
}
