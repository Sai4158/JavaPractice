package a_DSA_leetcode;

import java.util.HashMap;

public class _290_Word_Pattern {
	
	
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
        	
            for (int j = i + 1; j < pattern.length(); j++) {
            	
                if (pattern.charAt(i) == pattern.charAt(j) && !words[i].equals(words[j])) {
                    return false; 

                }
                
                if (pattern.charAt(i) != pattern.charAt(j) && words[i].equals(words[j])) {
                    return false; 
                }
            }
        }

        return true;
    }
	
	public static void main(String[] args) {
	
		String pattern = "abba";
		String s = "dog cat cat dog";
		
		System.out.println(wordPattern(pattern, s));
	
	}
}
