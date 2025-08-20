package a_DSA_leetcode;

import java.util.HashMap;

public class _2068_Check_Whether_Two_Strings_are_Almost_Equivalent {


	public static boolean checkAlmostEquivalent(String word1, String word2) {

		HashMap<Character, Integer> hm1 =  new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm2 =  new HashMap<Character, Integer>();



		for (int i = 0; i < word1.length(); i++) {

			hm1.put(word1.charAt(i), hm1.getOrDefault(word1.charAt(i), 0)+1);
			hm2.put(word2.charAt(i), hm2.getOrDefault(word2.charAt(i), 0)+1);

		}


		for (char c ='a'; c <= 'z'; c++) {

			int count1 = hm1.getOrDefault(c, 0);
			int count2 = hm2.getOrDefault(c, 0);


			if (Math.abs(count1 - count2) > 3) {
				return false;
			}

		}


		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkAlmostEquivalent("aaaa", "bccb"));   
	}
}
