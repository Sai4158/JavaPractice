package a_DSA_leetcode;

import java.util.HashMap;

public class _3158_Find_the_XOR_of_Numbers_Which_Appear_Twice {
	
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) return "";

		String ans = "";

		for (int i = 0; i < strs[0].length(); i++) { 
			char c = strs[0].charAt(i); 

			for (int j = 1; j < strs.length; j++) { 

				if (i >= strs[j].length() || strs[j].charAt(i) != c) {
					return ans;
				}
			}

			ans += c; 
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,1,3};
		System.out.println(duplicateNumbersXOR(nums));
	
	}
}
