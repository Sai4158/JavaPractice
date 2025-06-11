package a_DSA_leetcode;

public class _1780_Check_if_Number_is_a_Sum_of_Powers_of_Three {

	public static boolean checkPowersOfThree(int n) {

		for (int i = 0; n > 0; i++) {
			
			int remainder = n % 3;
			
			if (remainder == 2) {
				return false;
			}
			
			n = n / 3;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPowersOfThree(12));
	}
}
