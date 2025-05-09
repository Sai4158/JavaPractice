package a_DSA_leetcode;

public class _1716_Calculate_Money_in_Leetcode_Bank {

	public static int totalMoney(int n) {

		int count = 0;
		int week = 0;

		for (int i = 1; i <= n; i++) {

			count += week +(i%7 == 0 ? 7 : i % 7);

			if(i % 7 == 0) {
				week++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(totalMoney(4));
	}
}
