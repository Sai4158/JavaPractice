package a_DSA_leetcode;

public class _2697_Lexicographically_Smallest_Palindrome {

	public static String makeSmallestPalindrome(String s) {

		char[] chars = s.toCharArray();
		
		int i = 0;
		int j = chars.length-1;

		while(i<j) {

			if(chars[i] != chars[j]) {

				char smaller  = (chars[i] < chars[j] ? chars[i] : chars[j]);

				chars[i] =  smaller;
				chars[j] = smaller;

			}
			i++;
			j--;

		}

		return new String(chars);

	}

	public static void main(String[] args) {
		System.out.println(makeSmallestPalindrome("egcfe"));
	}
}
