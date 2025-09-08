package a_DSA_leetcode;

public class _2255_Count_Prefixes_of_a_Given_String {

	public static int countPrefixes(String[] words, String s) {

		int n =  words.length;
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			
			
			if(s.startsWith(words[i])) {
				count++;
			}
			
		}
		
		return count;
		
	}

	public static void main(String[] args) {

		String  words[] = {"a","b","c","ab","bc","abc"};
		String s = "abc";

		
		System.out.println(countPrefixes(words, s));
	}
}
