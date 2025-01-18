package a_DSA_leetcode;

import java.util.HashMap;

public class _171_Excel_Sheet_Column_Number {

	public static int titleToNumber(String columnTitle) {

		HashMap<Character, Integer> hs = new HashMap<>();

		for (int i = 0; i < 26; i++) {
			hs.put((char) ('A' + i), i + 1);
		}

		int result = 0;

		for (int i = 0; i < columnTitle.length(); i++) {
			char c = columnTitle.charAt(i);
			
			result = result * 26 + hs.get(c); 
		}

		return result;
	}


	public static void main(String[] args) {

		String a = "AB";
		System.out.println(titleToNumber(a));

	}
}
