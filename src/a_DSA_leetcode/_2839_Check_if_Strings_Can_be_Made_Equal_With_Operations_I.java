package a_DSA_leetcode;

import java.util.Arrays;

public class _2839_Check_if_Strings_Can_be_Made_Equal_With_Operations_I {
	
    public static boolean canBeEqual(String s1, String s2) {
        
    	char[] even1 = {s1.charAt(0), s1.charAt(2)};
    	char[] even2 = {s2.charAt(0), s2.charAt(2)};
    	
    	char[] odd1 = {s1.charAt(1), s1.charAt(3)};
    	char[] odd2 = {s2.charAt(1), s2.charAt(3)};
    	
    	Arrays.sort(even1);
    	Arrays.sort(even2);
    	Arrays.sort(odd1);
    	Arrays.sort(odd2);
    	
    	return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
    	
    }
	
	public static void main(String[] args) {
		String s1 = "abcd", s2 = "cdab";
		System.out.println(canBeEqual(s1, s2));
	}
}
