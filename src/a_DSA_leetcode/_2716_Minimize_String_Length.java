package a_DSA_leetcode;

import java.util.HashSet;

public class _2716_Minimize_String_Length {
    public static int minimizedStringLength(String s) {
        
    	HashSet<Character> hs =  new HashSet<Character>();
    	
    	for (int i = 0; i < s.length(); i++) {
			
    		hs.add(s.charAt(i));
    		
		}
    	return hs.size();
    }
    public static void main(String[] args) {
    	String s = "aaabc";
    	System.out.println(minimizedStringLength(s));
	}
}
