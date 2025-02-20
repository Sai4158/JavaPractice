package a_DSA_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _1657_Determine_if_Two_Strings_Are_Close {


	public static boolean closeStrings(String word1, String word2) {

		if(word1.length() != word2.length()) {
			return false;
		}

		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> set2 = new HashSet<>();
		HashMap<Character, Integer> freq1 = new HashMap<>();
		HashMap<Character, Integer> freq2 = new HashMap<>();


		for (int i = 0; i < word1.length(); i++) {

			set1.add(word1.charAt(i));

			freq1.put(word1.charAt(i), freq1.getOrDefault(word1.charAt(i), 0)+1);
		}

		for (int i = 0; i < word2.length(); i++) {

			set2.add(word2.charAt(i));

			freq2.put(word2.charAt(i), freq2.getOrDefault(word2.charAt(i), 0)+1);
		}

        if (!freq1.keySet().equals(freq2.keySet())) {
        	return false;
        }
			

		int[] freqArr1 = new int[freq1.size()];
		int[] freqArr2 = new int[freq2.size()];

		int i = 0;
		for (int value : freq1.values()) {
			freqArr1[i++] = value;
		}
		
		i = 0;
		for (int value : freq2.values()) {
			freqArr2[i++] = value;
		}

		Arrays.sort(freqArr1);
		Arrays.sort(freqArr2);

		// Compare frequency distributions
		return Arrays.equals(freqArr1, freqArr2);
	}

	public static void main(String[] args) {

		String word1 = "abc", word2 = "bca";
		System.out.println(closeStrings(word1, word2));
	}
}
