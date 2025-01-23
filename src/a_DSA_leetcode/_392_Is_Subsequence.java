package a_DSA_leetcode;

public class _392_Is_Subsequence {

	public static boolean isSubsequence(String s, String t) {

		int n =  t.length();
		boolean check =  false;
		String c = "";
		
		int a = 0;
		
		for (int i = 0; i < n; i++) {
			
			if(a < s.length() && s.charAt(a) == t.charAt(i)) {
				 c += t.charAt(i);
				 a++;
			}

		}
		
		if(s.equals(c)) {
			check = true;
		}
		
		return check;
	}

	public static void main(String[] args) {

		String s = "abc";
		String t = "ahbgdc";

		System.out.println(isSubsequence(s, t));
	}
}
