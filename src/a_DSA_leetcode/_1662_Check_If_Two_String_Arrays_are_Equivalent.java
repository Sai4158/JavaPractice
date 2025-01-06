package a_DSA_leetcode;

public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		String newWord1 = "";
		String newWord2 = "";

		for (int i = 0; i < word1.length; i++) {
				newWord1 += word1[i];

			}

		for (int i = 0; i < word2.length; i++) {
				newWord2 += word2[i];

		}
		
		
		if(newWord1.equals(newWord2)) {
			return true;
		}else {
			return false;
		}

	}

	public static void main(String[] args) {

		String words1[] = {"ab", "c"};
		String words2[] = {"a", "bc"};

		System.out.println(arrayStringsAreEqual(words1, words2));
	}
}
