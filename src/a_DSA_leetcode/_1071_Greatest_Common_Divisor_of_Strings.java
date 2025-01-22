package a_DSA_leetcode;

import java.util.HashMap;

public class _1071_Greatest_Common_Divisor_of_Strings {

	public static String gcdOfStrings(String str1, String str2) {

		if(!str1.contains(str2) && !str2.contains(str2)) {
			return "";
		}
		
		int min = Math.min(str1.length(), str2.length());
		
		for (int i = min; i> 0; i--) {
			String sub = str1.substring(0, i);
			
			if (str1.replaceAll(sub, "").isEmpty() && str2.replaceAll(sub, "").isEmpty()) {
                return sub;
            }
		}
		return "";
	}

	public static void main(String[] args) {

		String str1 = "ABCABC", str2 = "ABC";
		System.out.println(gcdOfStrings(str1, str2));
	}
}
