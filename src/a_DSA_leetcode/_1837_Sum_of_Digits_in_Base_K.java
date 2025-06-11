package a_DSA_leetcode;

public class _1837_Sum_of_Digits_in_Base_K {

	public static int sumBase(int n, int k) {

		int sum = 0;

		for (int i = 0; n>0; i++) {
			// get last digit in base k
			int digit = n % k;
			sum += digit;
			// move to next digit
			n = n/k;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumBase(34, 6));
	}
}
