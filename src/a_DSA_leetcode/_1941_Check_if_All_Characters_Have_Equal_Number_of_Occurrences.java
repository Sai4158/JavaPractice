package a_DSA_leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class _1941_Check_if_All_Characters_Have_Equal_Number_of_Occurrences {

	public static boolean areOccurrencesEqual(String s) {

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		} 

		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(char ch : hm.keySet()) {
			hs.add(hm.get(ch));
		}

		return hs.size() == 1;
	}

	public static void main(String[] args) {

	}
}
