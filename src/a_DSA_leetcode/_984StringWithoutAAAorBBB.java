package a_DSA_leetcode;

public class _984StringWithoutAAAorBBB {

	public static String strWithout3a3b(int a, int b) {


		StringBuilder sb =  new StringBuilder();
		
		while (a > 0 || b > 0) {
			int n = sb.length();
			boolean aa = n >= 2 && sb.charAt(n-1) == 'a' && sb.charAt(n-2) == 'a';
			boolean bb = n >= 2 && sb.charAt(n-1) == 'b' && sb.charAt(n-2) == 'b';
			if ((a >= b && !aa) || bb) {
				if (a > 0) { sb.append('a'); a--; }
				else { sb.append('b'); b--; }
			} else {
				if (b > 0) { sb.append('b'); b--; }
				else { sb.append('a'); a--; }
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		int a = 1, b = 2;
		System.out.println(strWithout3a3b(a, b));
	}

}
