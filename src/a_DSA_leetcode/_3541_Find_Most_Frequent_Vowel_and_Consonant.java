package a_DSA_leetcode;

public class _3541_Find_Most_Frequent_Vowel_and_Consonant {

	public static int maxFreqSum(String s) {
		int[] freq = new int[26];
		int maxVowel = 0, maxConsonant = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			
			char ch = (char) (i + 'a');
			
			
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				maxVowel = Math.max(maxVowel, freq[i]);
			} else {
				maxConsonant = Math.max(maxConsonant, freq[i]);
			}
		}

		return maxVowel + maxConsonant;
	}

	public static void main(String[] args) {
		System.out.println(mostFrequentVowelConsonant("successes")); 
	}
}
