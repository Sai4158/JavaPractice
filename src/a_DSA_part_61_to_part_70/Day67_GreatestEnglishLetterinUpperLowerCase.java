package a_DSA_part_61_to_part_70;

import java.util.HashSet;

public class Day67_GreatestEnglishLetterinUpperLowerCase {
	
    public static String greatestLetter(String s) {

    	HashSet<Character> hs = new HashSet<Character>();
    	
    	
    	for (int i = 0; i < s.length(); i++) {
			
    		hs.add(s.charAt(i));
		}
    	
    	
//    	add the greatest alphabet
    	for(char i = 'z'; i >= 'a'; i--) {
    		if(hs.contains(i) && hs.contains(Character.toUpperCase(i))) {
    			
    			return String.valueOf(i);
    			
    		}
    	}
    	
    	return "";
    }
	
    public static void main(String[] args) {
		String  s = "lEeTcOdE";
		System.out.println(greatestLetter(s));
	}
}
