package a_DSA_leetcode;

import java.util.HashMap;

public class _242_Valid_Anagram_1 {

    public static boolean isAnagram(String s, String t) {
        
    	if(s.length() != t.length()) {
    		return false;
    	}
    	
    	HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
    	HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
    	
    	
    	
    	for (int i = 0; i < s.length(); i++) {
			hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0)+1);
			hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i), 0)+1);

		}

     	
   
    	return hm1.equals(hm2);
    }
    
    public static void main(String[] args) {
		
    	String s = "anagram", t = "nagaram";
    	System.out.println(isAnagram(s, t));
    	
    	String s1 = "anagram", t2 = "nagaram";
    	System.out.println(isAnagram(s1, t2));
	}
	
}
