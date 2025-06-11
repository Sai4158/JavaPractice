package a_DSA_leetcode;

public class _1309_Decrypt_String_from_Alphabet_to_Integer_Mapping {

	public static String freqAlphabets(String s) {

		String ans = "";

		for (int i = 0; i < s.length(); ) {

			if (i + 2 < s.length() && s.charAt(i + 2) == '#') {

				int num = Integer.parseInt(s.substring(i, i + 2));
				ans += (char) ('a' + num - 1);
				i += 3; 

			} else {

				int num = s.charAt(i) - '0';
				ans += (char) ('a' + num - 1);
				i++;

			}
		}

		return ans;
	}


	public static void main(String[] args) {
		System.out.println(freqAlphabets("10#11#12"));
	}
}
