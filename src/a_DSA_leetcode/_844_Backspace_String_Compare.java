package a_DSA_leetcode;

public class _844_Backspace_String_Compare {

	public static boolean backspaceCompare(String s, String t) {

		return isPossible(s).equals(isPossible(t));
	}

	public static String isPossible(String str) {

		StringBuilder sb =  new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if(str.charAt(i) == '#') {
				if(sb.length()>0) {
					sb.deleteCharAt(sb.length() - 1);
				}
			}
			else {
				sb.append(str.charAt(i));
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		
		System.out.println(backspaceCompare(s, t));
	}
}
