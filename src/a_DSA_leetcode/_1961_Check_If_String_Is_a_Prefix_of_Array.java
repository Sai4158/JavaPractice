package a_DSA_leetcode;

public class _1961_Check_If_String_Is_a_Prefix_of_Array {

	public static boolean isPrefixString(String s, String[] words) {

		int n = words.length;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(words[i]);


			if(s.startsWith(sb.toString())) {
				return true;
			}


		}

		return false;
	}

	public static void main(String[] args) {
		String s = "iloveleetcode";
		String[] words = {"i", "love", "leetcode", "apples"};
		System.out.println(isPrefixString(s, words)); 
	}
}
