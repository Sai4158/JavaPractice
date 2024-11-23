package a_DSA_leetcode;

import java.util.Collections;

public class _125_Valid_Palindrome {
	public static boolean isPalindrome(String s) {

		int n = s.length();

		s.trim();

		String reversed = "";
		String normal = "";


		//		for normal
		for (int i = 0; i <n; i++) {

			char ch =  s.charAt(i);

			if(Character.isLetterOrDigit(ch)) {
                normal += Character.toLowerCase(ch);
			}
		}


		//		For reversed
		for (int i = n-1; i >=0; i--) {
			
			char ch =  s.charAt(i);

			if(Character.isLetterOrDigit(ch)) {
                reversed += Character.toLowerCase(ch); 
			}
		}

		
		return normal.equals(reversed);

	}



	//	Main 
	public static void main(String[] args) {

		String s = "iii";

		System.out.println(isPalindrome(s));
	}
}
