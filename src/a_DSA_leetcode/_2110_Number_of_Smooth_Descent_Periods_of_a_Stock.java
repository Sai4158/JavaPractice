package a_DSA_leetcode;

public class _2110_Number_of_Smooth_Descent_Periods_of_a_Stock {

	public static long getDescentPeriods(int[] prices) {

		int l = 0;  
		int n = prices.length;
		long ans = 0;

		for (int r = 0; r < n; r++) {

			if (r > 0 && prices[r] != prices[r - 1] - 1) {
				l = r;
			}

			ans += (r - l + 1);
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] prices1 = {3,2,1,4};
		System.out.println(getDescentPeriods(prices1));
	}
}
