package a_DSA_part_41_to_part_50;

public class Day39_TwoPointersIsSubsequence {
	
	
	public static boolean isSubsequence(String s, String t) {
		
		int i =0;
		int j = 0;
		
		while(i<s.length() && j<t.length()) {
			
			if(s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		
		return i == s.length();
		
	}
	
	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";

		System.out.println(isSubsequence(s, t));
	}
}
