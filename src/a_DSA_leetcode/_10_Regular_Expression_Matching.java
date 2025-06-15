package a_DSA_leetcode;

public class _10_Regular_Expression_Matching {


	public static boolean isMatch(String s, String p) {

		if (p.isEmpty()) {
			return s.isEmpty();
		}

		boolean firstChar = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

		if (p.length() >= 2 && p.charAt(1) == '*') {
			return isMatch(s, p.substring(2)) || (firstChar && isMatch(s.substring(1), p));
		} 


		else {
			return firstChar && isMatch(s.length() > 1 ? s.substring(1) : "", 
					p.length() > 1 ? p.substring(1) : "");
		}
	}




	public static void main(String[] args) {

		String s = "aa", p = "a";
		System.out.println(isMatch(s, p));
	}
}
