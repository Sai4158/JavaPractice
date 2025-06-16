package a_DSA_leetcode;

public class _13_Roman_to_Integer {

	public static int romanToInt(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (i < s.length() - 1) {

				char next = s.charAt(i + 1);

				if (c == 'I' && (next == 'V' || next == 'X')) {
					count -= 1;
				} 

				else if (c == 'X' && (next == 'L' || next == 'C')) {
					count -= 10;
				} 

				else if (c == 'C' && (next == 'D' || next == 'M')) {
					count -= 100;
				} 

				else {
					count += value(c);
				}
			} 

			else {
				count += value(c);
			}

		}
		return count;

	}

	//	Helper
	public static int value(char c) {

		if (c == 'I') return 1;
		if (c == 'V') return 5;
		if (c == 'X') return 10;
		if (c == 'L') return 50;
		if (c == 'C') return 100;
		if (c == 'D') return 500;
		if (c == 'M') return 1000;
		return 0;
	}

	public static void main(String[] args) {

		String s = "III";
		System.out.println(romanToInt(s));
	}
}
