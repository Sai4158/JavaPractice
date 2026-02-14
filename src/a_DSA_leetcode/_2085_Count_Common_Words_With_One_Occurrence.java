package a_DSA_leetcode;

import java.util.HashMap;

public class _2085_Count_Common_Words_With_One_Occurrence {

	public static int countWords(String[] words1, String[] words2) {

		HashMap<String, Integer> m1 = new HashMap<>();
		HashMap<String, Integer> m2 = new HashMap<>();

		for (String w : words1) {
			m1.put(w, m1.getOrDefault(w, 0) + 1);
		}

		for (String w : words2) {
			m2.put(w, m2.getOrDefault(w, 0) + 1);
		}

		int count  = 0;

		for (String w : m1.keySet()) {

			if (m1.get(w) == 1 && m2.getOrDefault(w, 0) == 1) {
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {
		String[] words1 = {"leetcode","is","amazing","as","is"};
		String[] words2 = {"amazing","leetcode","is"};
		System.out.println(countWords(words1, words2));
	}

}
