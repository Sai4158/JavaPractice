package a_DSA_leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class _459_Repeated_Substring_Pattern {

	public static boolean repeatedSubstringPattern(String s) {


		int n = s.length();

		for (int i = 1; i <= n/2; i++) {

			if(n % i ==0) {


				int l =0;
				int r =i;

				while(r<n && s.charAt(l) == s.charAt(r)) {
					l++;
					r++;
				}
				if( r == n) {
					return true;
				}
			}
		}
		return false;
	}


	public static void main(String[] args) {

		String s = "abab";

		System.out.println(repeatedSubstringPattern(s));
	}
}	

