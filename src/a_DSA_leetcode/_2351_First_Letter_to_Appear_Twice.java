package a_DSA_leetcode;

import java.util.HashMap;

public class _2351_First_Letter_to_Appear_Twice {
	
    public static char repeatedCharacter(String s) {
        
    	
    	HashMap<Character, Integer>hm =  new HashMap<Character, Integer>();
    	
    	char ans = ' ';
    	int n =  s.length();

    	for (int i = 0; i < n; i++) {
    		
    		char c = s.charAt(i);
    		
    		hm.put(c, hm.getOrDefault(c, 0)+1);
		
    		if (hm.get(c) == 2) {
    			return c;
    		}
		}
    	return ans;
    }
    
    public static void main(String[] args) {
		String s = "abccbaacz";
		System.out.println(repeatedCharacter(s));
	}
}
