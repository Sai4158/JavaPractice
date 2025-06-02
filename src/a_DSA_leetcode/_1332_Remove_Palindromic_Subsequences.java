package a_DSA_leetcode;

public class _1332_Remove_Palindromic_Subsequences {

	public static int removePalindromeSub(String s) {

		int n = s.length();
		StringBuilder check =  new StringBuilder(s);
		int ans = 0;

		if(check.isEmpty()) {
			return 0;
		}
		
		if(check.reverse().toString().equals(s)) {
			return 1;
		}

		
		return 2;

	}

	public static void main(String[] args) {
		String s = "ababa";
		System.out.println(removePalindromeSub(s));
	}
}
