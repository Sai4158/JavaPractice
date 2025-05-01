package a_DSA_leetcode;

public class _3079_Find_the_Sum_of_Encrypted_Integers {

	public static int sumOfEncryptedInt(int[] nums) {

		int n = nums.length;
		int total = 0;

		for (int i = 0; i < n; i++) {

			String s =  String.valueOf(nums[i]);
			char max = 0;


			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) > max) {
					max = s.charAt(j);
				}
			}

			StringBuilder sb =  new StringBuilder();

			for (int j = 0; j < s.length(); j++) {

				sb.append(max);
			}

			total += Integer.parseInt(sb.toString());
		}
		return total;
	}

	public static void main(String[] args) {
		int[] nums = {10, 21, 31};
		System.out.println(sumOfEncryptedInt(nums));	
	}
}
