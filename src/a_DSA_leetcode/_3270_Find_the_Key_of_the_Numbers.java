package a_DSA_leetcode;

public class _3270_Find_the_Key_of_the_Numbers {

	public static int generateKey(int num1, int num2, int num3) {

		StringBuilder sb = new StringBuilder();

		String a1 = String.format("%04d", num1);
		String a2 = String.format("%04d", num2);
		String a3 = String.format("%04d", num3);

		int min = 0;
		for (int i = 0; i < 4; i++) {

			int d1 = a1.charAt(i) - '0';
			int d2 = a2.charAt(i) - '0';
			int d3 = a3.charAt(i) - '0';


			min = Math.min(d1, Math.min(d2, d3));

			sb.append(min);
		}

		return Integer.parseInt(sb.toString());

	}

	public static void main(String[] args) {
		System.out.println(generateKey(1, 10, 1000));
	}
}
