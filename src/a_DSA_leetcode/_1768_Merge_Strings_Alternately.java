package a_DSA_leetcode;

public class _1768_Merge_Strings_Alternately {
	
	
	public static String mergeAlternately(String word1, String word2) {
		
		int mathMax = Math.max(word1.length(), word2.length());
		String total = "";
		
		
		for (int i = 0; i < mathMax; i++) {
			for (int j = 0; j < mathMax; j++) {
				if(j==0 && i < word1.length() ) {
					total += word1.charAt(i);
				}
				if(j==1 && i < word2.length() ) {
					total += word2.charAt(i);
				}
			}
		}
		
		return total;
				
    }
	
	
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 =  "efg";
		
		System.out.println(mergeAlternately(s1, s2));
	}
}
