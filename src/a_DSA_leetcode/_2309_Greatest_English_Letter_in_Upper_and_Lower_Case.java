package a_DSA_leetcode;

import java.util.HashSet;

public class _2309_Greatest_English_Letter_in_Upper_and_Lower_Case {
	
    public static String greatestLetter(String s) {

    	
    	HashSet<Character> hs = new HashSet<Character>();
    	
    	for(char c :  s.toCharArray()) {
    		hs.add(c);
    	}

    	for (char i = 'Z'; i >= 'A'; i--) {
			
    		if(hs.contains(i) && hs.contains(Character.toLowerCase(i))) {
    			return  String.valueOf(i);
    		}
    		
		}
    	
    	return "";
    	
    }
    
    public static void main(String[] args) {
		String  s = "lEeTcOdE";
		System.out.println(greatestLetter(s));
	}
}
