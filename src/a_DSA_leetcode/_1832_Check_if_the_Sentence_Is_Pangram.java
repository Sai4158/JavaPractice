package a_DSA_leetcode;

import java.util.HashSet;

public class _1832_Check_if_the_Sentence_Is_Pangram {
    public static boolean checkIfPangram(String sentence) {
        
    	HashSet<Character> s1 = new HashSet<Character>();
    	
    	for (int i = 0; i < sentence.length(); i++) {
    		
    		char ch =  sentence.charAt(i);
    		
			s1.add(ch);
		}
    	
    	if(s1.size() == 26) {
    		return true;
    	}else {
    		return false;
    	}
    	
    }
    
    public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
	}
}
