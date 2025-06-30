package a_DSA_part_71_to_part_80;

public class Day75_ValidPalindromeII {

	public static boolean validPalindrome(String s) {

		int n =  s.length();

		int l = 0;
		int r = n - 1;


		while(l < r) {

			if(s.charAt(l) != s.charAt(r)) {

				return (isplaindrom(s, l+1, r ) || isplaindrom(s, l, r-1 );

				l++;
				r--;

			}

		}
		return true;

	}



	private static boolean isplaindrom(String s, int l, int r) {

		while(l < r) {

			if(s.charAt(l) !=  s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;

	}



	public static void main(String[] args) {
		String s = "aba";
		System.out.println(validPalindrome(s));
	}
}
