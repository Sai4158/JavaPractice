package a_DSA_leetcode;

public class _2185_Counting_Words_With_a_Given_Prefix {

	public static int prefixCount(String[] words, String pref) {

		int n =  words.length;
		int count = 0;

		for (int i = 0; i < words.length; i++) {

			if(words[i].startsWith(pref)) {
				count++;
			}

		}

		return count;

	}


	public static void main(String[] args) {

		String words[] = {"pay","attention","practice","attend"};
		String pref =  "at";

		System.out.println(prefixCount(words, pref));


	}
}
