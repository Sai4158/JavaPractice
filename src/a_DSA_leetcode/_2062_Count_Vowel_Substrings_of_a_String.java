package a_DSA_leetcode;

import java.util.HashSet;
import java.util.Set;

public class _2062_Count_Vowel_Substrings_of_a_String {
	
    public static int countVowelSubstrings(String word) {
        
    	int n = word.length();
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		Set<Character> hs = new HashSet<Character>();
    		
    		for (int j = i; j < n; j++) {
				
    			char ch =  word.charAt(j);
    			
    			if(isVowel(ch)) {
    				hs.add(ch);
    				
    				if(hs.size()==5) {
    					count++;
    				}
    				
    			}else {
    				break;
    			}
    			
    			
			}
    		
		}
    	
    	return count;

    	
    }
	
	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	 public static void main(String[] args) {
	        String word = "aeiouu";
	        System.out.println("Vowel substrings: " + countVowelSubstrings(word)); 
	    }
}
