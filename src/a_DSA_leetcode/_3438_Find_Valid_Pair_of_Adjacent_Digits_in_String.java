package a_DSA_leetcode;

import java.util.HashMap;

public class _3438_Find_Valid_Pair_of_Adjacent_Digits_in_String {

	public static String findValidPair(String s) {

		int n = s.length();

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {

			int c = Character.getNumericValue(s.charAt(i));

			hm.put(c, hm.getOrDefault(c, 0)+1);

		}

		for (int i = 0; i <n-1; i++) {

			int first = Character.getNumericValue(s.charAt(i));
			int second = Character.getNumericValue(s.charAt(i + 1));

			if (first != second) {

				if (hm.get(first) == first && hm.get(second) == second) {

					return "" + s.charAt(i) + s.charAt(i + 1);
				}
			}

		}

		return "";	
	}

	public static void main(String[] args) {
		String s = "2523533";
		System.out.println(findValidPair(s));
	}

}
